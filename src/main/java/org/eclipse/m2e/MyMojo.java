package org.eclipse.m2e;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.util.List;

/**
 * Goal which just spits out info.
 * 
 * @goal dummy
 * 
 */
public class MyMojo extends AbstractMojo {

    /**
     * fake parameter to make Intellij Idea pom plugin validation succeed
     *
     * @parameter
     */
    private List lifecycleMappingMetadata;

    /** {@inheritDoc} */
    public void execute() throws MojoExecutionException {
        getLog().info("See http://stackoverflow.com/questions/7905501/get-rid-of-pom-not-found-warning-for-org-eclipse-m2elifecycle-mapping/8741403#8741403");
    }
}
