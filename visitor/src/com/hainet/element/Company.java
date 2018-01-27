package com.hainet.element;

import com.hainet.visitor.Visitor;

// Element role
public interface Company {

    void accept(Visitor visitor);
}
