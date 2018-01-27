package com.hainet.element;

import com.hainet.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

// Concrete element role & Object structure role
public final class BigCompany implements Company {

    private String name;

    private List<Company> subsidiary = new ArrayList<>();

    public BigCompany(final String name) {
        this.name = name;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

    public void add(final Company company) {
        this.subsidiary.add(company);
    }

    public List<Company> getSubsidiary() {
        return this.subsidiary;
    }

    @Override
    public String toString() {
        return "Welcome to " + this.name + "!";
    }
}
