package com.hainet.printer.adapter;

import com.hainet.printer.adaptee.BackEndPrinter;
import com.hainet.printer.target.FrontEndPrinter;

// Adapter Role with Delegate
public class PrinterAdapterDelegate implements FrontEndPrinter {

    private final BackEndPrinter backEndPrinter;

    public PrinterAdapterDelegate(final String str) {
        this.backEndPrinter = new BackEndPrinter(str);
    }

    @Override
    public String week() {
        return this.backEndPrinter.withParen();
    }

    @Override
    public String strong() {
        return this.backEndPrinter.withAster();
    }
}
