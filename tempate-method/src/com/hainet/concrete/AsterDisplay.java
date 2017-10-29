package com.hainet.concrete;

import com.hainet.template.Display;

// Concrete Class Role
public class AsterDisplay extends Display {

    private final String str;

    public AsterDisplay(final String str) {
        this.str = str;
    }

    protected void open() {
        System.out.print("*");
    }

    protected void print() {
        System.out.print(str);
    }

    protected void close() {
        System.out.println("*");
    }
}
