package com.hainet.framework;

// Factory Role
public abstract class Factory {

    public final Product Factory(String owner) {
        return create(owner);
    }

    public abstract Product create(String owner);
}
