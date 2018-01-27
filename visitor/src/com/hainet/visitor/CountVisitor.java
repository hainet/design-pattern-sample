package com.hainet.visitor;

import com.hainet.element.BigCompany;
import com.hainet.element.SmallCompany;

public final class CountVisitor implements Visitor {

    @Override
    public void visit(final SmallCompany smallCompany) {
        System.out.println("I have no company.");
    }

    @Override
    public void visit(final BigCompany bigCompany) {
        System.out.println("I have " + bigCompany.getSubsidiary().stream().mapToInt(value -> 1).sum() + "companies.");

        bigCompany.getSubsidiary().forEach(subsidiary -> subsidiary.accept(this));
    }
}
