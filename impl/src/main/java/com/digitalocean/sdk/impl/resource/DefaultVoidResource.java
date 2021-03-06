/*
 * Copyright 2017 Okta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.digitalocean.sdk.impl.resource;

import com.digitalocean.sdk.impl.ds.InternalDataStore;
import com.digitalocean.sdk.resource.VoidResource;

import java.util.Collections;
import java.util.Map;

/**
 * Default implementation of {@link VoidResource}.
 */
public class DefaultVoidResource extends AbstractResource implements VoidResource {

    public DefaultVoidResource(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultVoidResource(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return Collections.emptyMap();
    }
}