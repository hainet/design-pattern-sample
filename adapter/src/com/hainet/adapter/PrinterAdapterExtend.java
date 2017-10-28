package com.hainet.adapter;

import com.hainet.adaptee.BackEndPrinter;
import com.hainet.target.FrontEndPrinter;

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
