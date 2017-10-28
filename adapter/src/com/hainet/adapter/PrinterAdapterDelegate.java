package com.hainet.adapter;

import com.hainet.adaptee.BackEndPrinter;
import com.hainet.target.FrontEndPrinter;

// Adapter Role with Delegate
public class PrinterAdapterDelegate implements FrontEndPrinter {

    private final BackEndPrinter backEndPrinter;

    public PrinterAdapterDelegate(final String str) {
        this.backEndPrinter = new BackEndPrinter(str);
    }

    @Override
    public String week() {
        return backEndPrinter.withParen();
    }

    @Override
    public String strong() {
        return backEndPrinter.withAster();
    }
}
