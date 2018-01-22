package com.hainet.product;

// Abstract product role
public abstract class Item {

    protected String item;

    Item(final String item) {
        this.item = item;
    }

    public abstract String create();
}
