package com.hainet.element;

import com.hainet.visitor.Visitor;

// Concrete element role
public final class SmallCompany implements Company {

    private String name;

    public SmallCompany(final String name) {
        this.name = name;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Welcome to " + this.name + "!";
    }
}
