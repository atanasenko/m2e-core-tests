/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.project;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Resolver configuration holder
 *
 * @author Eugene Kuleshov
 */
public class ResolverConfiguration implements Serializable {
  private static final long serialVersionUID = 1258510761534886581L;

  public static final String DEFAULT_FILTERING_GOALS = "process-resources resources:testResources";
  public static final String DEFAULT_FULL_BUILD_GOALS = "process-test-resources";

  private boolean includeModules = false;
  private boolean resolveWorkspaceProjects = true;
  private String activeProfiles = "";
  private String resourceFilteringGoals = DEFAULT_FILTERING_GOALS;
  private String fullBuildGoals = DEFAULT_FULL_BUILD_GOALS;

  /**
   * Skip execution of Maven compiler plugin
   */
  private boolean skipCompiler = true;

//  public ResolverConfiguration() {
//  }
//  
//  private ResolverConfiguration(boolean includeModules, boolean resolveWorkspaceProjects, String activeProfiles, boolean filterResources, boolean useMavenOutputFolders) {
//    this.includeModules = includeModules;
//    this.resolveWorkspaceProjects = resolveWorkspaceProjects;
//    this.activeProfiles = activeProfiles;
//    this.filterResources = filterResources;
//    this.useMavenOutputFolders = useMavenOutputFolders;
//  }

  public boolean shouldIncludeModules() {
    return this.includeModules;
  }
  
  public boolean shouldResolveWorkspaceProjects() {
    return this.resolveWorkspaceProjects;
  }

  public String getActiveProfiles() {
    return this.activeProfiles;
  }
  
  public List<String> getActiveProfileList() {
    return Arrays.asList(activeProfiles.split("[,\\s\\|]"));
  }

  public void setResolveWorkspaceProjects(boolean resolveWorkspaceProjects) {
    this.resolveWorkspaceProjects = resolveWorkspaceProjects;
  }
  
  public void setIncludeModules(boolean includeModules) {
    this.includeModules = includeModules;
  }
  
  public void setActiveProfiles(String activeProfiles) {
    this.activeProfiles = activeProfiles;
  }
  
  public String getResourceFilteringGoals() {
    return resourceFilteringGoals;
  }
  
  public void setResourceFilteringGoals(String resourceFilteringGoals) {
    this.resourceFilteringGoals = resourceFilteringGoals;
  }

  public String getFullBuildGoals() {
    return fullBuildGoals;
  }

  public void setFullBuildGoals(String fullBuildGoals) {
    this.fullBuildGoals = fullBuildGoals;
  }

  public boolean isSkipCompiler() {
    return this.skipCompiler;
  }
  
  public void setSkipCompiler(boolean skipCompiler) {
    this.skipCompiler = skipCompiler;
  }
}
