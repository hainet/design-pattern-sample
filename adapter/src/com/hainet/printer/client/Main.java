package com.hainet.printer.client;

import com.hainet.printer.adapter.PrinterAdapterDelegate;
import com.hainet.printer.adapter.PrinterAdapterExtend;
import com.hainet.printer.target.FrontEndPrinter;

// Client Role
public class Main {

    public static void main(String[] args) {
        // MainはBannerクラス, PrintBannerクラスの実装を知る必要がない。
        // Printインターフェースのみ利用する。

        // Extend
        FrontEndPrinter extend = new PrinterAdapterExtend("AdapterExtend");

        System.out.println(extend.week());
        System.out.println(extend.strong());

        // Delegate
        FrontEndPrinter delegate = new PrinterAdapterDelegate("AdapterDelegate");

        System.out.println(delegate.week());
        System.out.println(delegate.strong());
    }
}
