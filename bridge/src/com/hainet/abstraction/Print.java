package com.hainet.abstraction;

import com.hainet.implementor.PrintImpl;

// Abstraction role
public class Print {

    private PrintImpl impl;

    public Print(final PrintImpl impl) {
        this.impl = impl;
    }

    private void open() {
        impl.rawOpen();
    }

    private void print() {
        impl.rawPrint();
    }

    private void close() {
        impl.rawClose();
    }

    public void run() {
        this.open();
        this.print();
        this.close();
    }
}
