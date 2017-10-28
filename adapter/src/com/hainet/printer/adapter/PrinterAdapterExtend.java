package com.hainet.printer.adapter;

import com.hainet.printer.adaptee.BackEndPrinter;
import com.hainet.printer.target.FrontEndPrinter;

// Adapter Role with Extend
public class PrinterAdapterExtend extends BackEndPrinter implements FrontEndPrinter {

    public PrinterAdapterExtend(String str) {
        super(str);
    }

    @Override
    public String week() {
        return withParen();
    }

    @Override
    public String strong() {
        return withAster();
    }
}
