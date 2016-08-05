/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.screens.datasource.management.model;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.uberfire.backend.vfs.Path;

@Portable
public class DriverDefInfo extends DefInfo {

    private DriverDeploymentInfo deploymentInfo;

    public DriverDefInfo() {
    }

    public DriverDefInfo( String uuid, String name, Path path, DriverDeploymentInfo deploymentInfo ) {
        super( uuid, name, path );
        this.deploymentInfo = deploymentInfo;
    }

    public DriverDefInfo( String uuid, String name, DriverDeploymentInfo deploymentInfo ) {
        super( uuid, name );
        this.deploymentInfo = deploymentInfo;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Path getPath() {
        return path;
    }

    @Override
    boolean isDeployed() {
        return deploymentInfo != null;
    }

    @Override
    public String toString() {
        return "DriverDefInfo{" +
                "deploymentInfo=" + deploymentInfo +
                "} " + super.toString();
    }
}
