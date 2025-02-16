/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.api.internal;

import org.apache.flink.table.catalog.CatalogManager;
import org.apache.flink.table.module.ModuleManager;
import org.apache.flink.table.operations.ExecutableOperation;

/** A simple implementation of {@link ExecutableOperation.Context}. */
public class ExecutableOperationContextImpl implements ExecutableOperation.Context {

    private final CatalogManager catalogManager;
    private final ModuleManager moduleManager;

    public ExecutableOperationContextImpl(
            CatalogManager catalogManager, ModuleManager moduleManager) {
        this.catalogManager = catalogManager;
        this.moduleManager = moduleManager;
    }

    @Override
    public CatalogManager getCatalogManager() {
        return catalogManager;
    }

    @Override
    public ModuleManager getModuleManager() {
        return moduleManager;
    }
}
