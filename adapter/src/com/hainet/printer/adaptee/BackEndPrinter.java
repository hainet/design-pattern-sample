package com.hainet.printer.adaptee;

// Adaptee Role
public class BackEndPrinter {

    private final String str;

    public BackEndPrinter(String str) {
        this.str = str;
    }

    public String withParen() {
        return new StringBuilder()
                .append("(")
                .append(str)
                .append(")").toString();
    }

    public String withAster() {
        return new StringBuilder()
                .append("*")
                .append(str)
                .append("*").toString();
    }
}
