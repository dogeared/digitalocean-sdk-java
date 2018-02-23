package com.digitalocean.sdk.impl.client;

import com.digitalocean.sdk.cache.CacheManager;
import com.digitalocean.sdk.client.AuthenticationScheme;
import com.digitalocean.sdk.client.Proxy;
import com.digitalocean.sdk.impl.api.ClientCredentialsResolver;
import com.digitalocean.sdk.impl.http.authc.RequestAuthenticatorFactory;
import com.digitalocean.sdk.impl.util.BaseUrlResolver;
import com.digitalocean.sdk.resource.droplet.Droplet;
import com.digitalocean.sdk.resource.droplet.DropletContainer;

import static com.digitalocean.sdk.lang.Assert.hasText;

public class DefaultClient extends AbstractClient {

    public DefaultClient(ClientCredentialsResolver clientCredentialsResolver,
                         BaseUrlResolver baseUrlResolver,
                         Proxy proxy,
                         CacheManager cacheManager,
                         AuthenticationScheme authenticationScheme,
                         RequestAuthenticatorFactory requestAuthenticatorFactory,
                         int connectionTimeout) {
        super(clientCredentialsResolver, baseUrlResolver, proxy, cacheManager, authenticationScheme, requestAuthenticatorFactory, connectionTimeout);
    }

    @Override
    public Droplet getDroplet(String id) {
        hasText(id, "'id' is required and cannot be null or empty.");
        String href = "/v2/droplets/" + id;
        DropletContainer dropletContainer = getDataStore().getResource(href, DropletContainer.class);
        return dropletContainer.getDroplet();
    }
}
