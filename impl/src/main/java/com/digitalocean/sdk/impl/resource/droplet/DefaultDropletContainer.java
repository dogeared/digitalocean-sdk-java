package com.digitalocean.sdk.impl.resource.droplet;

import com.digitalocean.sdk.impl.ds.InternalDataStore;
import com.digitalocean.sdk.impl.resource.AbstractInstanceResource;
import com.digitalocean.sdk.impl.resource.Property;
import com.digitalocean.sdk.impl.resource.ResourceReference;
import com.digitalocean.sdk.resource.droplet.Droplet;
import com.digitalocean.sdk.resource.droplet.DropletContainer;

import java.util.Map;

public class DefaultDropletContainer extends AbstractInstanceResource<DropletContainer> implements DropletContainer {

    private final static ResourceReference<Droplet> dropletProperty = new ResourceReference("droplet", Droplet.class, false);

    private final static Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(dropletProperty);

    public DefaultDropletContainer(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultDropletContainer(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }

    @Override
    public Droplet getDroplet() {
        return getResourceProperty(dropletProperty);
    }

    @Override
    public DropletContainer setDroplet(Droplet droplet) {
        setProperty(dropletProperty, droplet);
        return this;
    }
}
