package com.hainet.factory;

import com.hainet.product.Disk;
import com.hainet.product.Header;

public abstract class Factory {

    public static Factory getFactory(final String className) {
        try {
            return (Factory) Class.forName(className).newInstance();
        } catch (final InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Header createHeader(String item);

    public abstract Disk createDisk(String item);
}
