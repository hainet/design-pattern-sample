package com.hainet;

import com.hainet.framework.Product;

// Concrete prototype role
public class StrongMessage implements Product {

    @Override
    public void use(final String message) {
        System.out.println("**" + message + "**");
    }

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
