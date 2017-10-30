package com.hainet.idcard;

import com.hainet.framework.Product;

// Concrete Product Role
public class IdCard extends Product {

    private final int id;
    private final String owner;

    IdCard(final int id, final String owner) {
        this.id = id;
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(new StringBuilder()
                .append("(").append(id).append(")")
                .append("I am ")
                .append(owner)
                .toString());
    }
}
