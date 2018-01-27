package com.hainet.visitor;

import com.hainet.element.BigCompany;
import com.hainet.element.SmallCompany;

// Concrete visitor role
public final class ListVisitor implements Visitor {

    @Override
    public void visit(final SmallCompany smallCompany) {
        System.out.println(smallCompany);
    }

    @Override
    public void visit(final BigCompany bigCompany) {
        System.out.println(bigCompany);

        bigCompany.getSubsidiary().forEach(subsidiary -> subsidiary.accept(this));
    }
}
