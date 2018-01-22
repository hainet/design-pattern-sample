package com.hainet.product;

// Abstract product role
public abstract class Item {

    private String item;

    Item(final String item) {
        this.item = item;
    }

    protected String getItem() {
        return this.item;
    }

    public abstract String create();
}
