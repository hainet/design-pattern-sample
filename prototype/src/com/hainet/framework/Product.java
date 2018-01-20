package com.hainet.framework;

// Prototype role
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
