package com.hainet.concrete;

import com.hainet.template.Display;

// Concrete Class Role
public class ParenDisplay extends Display {

    private final String str;

    public ParenDisplay(final String str) {
        this.str = str;
    }

    protected void open() {
        System.out.print("(");
    }

    protected void print() {
        System.out.print(str);
    }

    protected void close() {
        System.out.println(")");
    }
}
