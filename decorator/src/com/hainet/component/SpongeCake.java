package com.hainet.component;

// Concrete component role
public class SpongeCake implements Cake {

    private String name;

    public SpongeCake(final String name) {
        this.name = name;
    }

    @Override
    public String get() {
        return this.name;
    }
}
