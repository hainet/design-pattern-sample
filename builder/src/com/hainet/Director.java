package com.hainet;

// Director role
public class Director {

    private Builder builder;

    public Director(final Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder
                .id(1)
                .name("hainet");
    }
}
