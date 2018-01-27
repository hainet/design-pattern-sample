package com.hainet.visitor;

import com.hainet.element.BigCompany;
import com.hainet.element.SmallCompany;

// Visitor role
public interface Visitor {

    void visit(SmallCompany smallCompany);

    void visit(BigCompany bigCompany);
}
