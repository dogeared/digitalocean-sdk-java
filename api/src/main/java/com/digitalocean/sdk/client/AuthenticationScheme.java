/*
 * Copyright 2014 Stormpath, Inc.
 * Modifications Copyright 2018 Okta, Inc.
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
package com.digitalocean.sdk.client;

import com.digitalocean.sdk.lang.Assert;

/**
 * Enumeration that defines the available HTTP authentication schemes to be used when communicating with the Digital Ocean API server.
 * <p>
 * The Authentication Scheme setting is helpful in cases where the code is run in a platform where the header information for
 * outgoing HTTP requests is modified and thus causing communication issues.
 * <p>
 * There is currently only one authentication scheme available: Bearer (Digital Ocean session bearer token).
 *
 * @since 0.5.0
 */
public enum AuthenticationScheme {

    Bearer("com.digitalocean.sdk.impl.http.authc.BearerAuthenticator");

    private final String requestAuthenticatorClassName;

    AuthenticationScheme(String requestAuthenticatorClassName) {
        Assert.notNull(requestAuthenticatorClassName, "requestAuthenticatorClassName cannot be null");
        this.requestAuthenticatorClassName = requestAuthenticatorClassName;
    }

    public String getRequestAuthenticatorClassName() {
        return this.requestAuthenticatorClassName;
    }
}
