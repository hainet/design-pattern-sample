package com.hainet.printer.adaptee;

// Adaptee Role
public class BackEndPrinter {

    private final String str;

    public BackEndPrinter(String str) {
        this.str = str;
    }

    public String withParen() {
        return "(" + str + ")";
    }

    public String withAster() {
        return "*" + str + "*";
    }
}
