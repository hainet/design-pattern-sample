package com.hainet.client;

import com.hainet.adapter.PrinterAdapterExtend;
import com.hainet.target.FrontEndPrinter;

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
        FrontEndPrinter delegate = new PrinterAdapterExtend("AdapterDelegate");

        System.out.println(delegate.week());
        System.out.println(delegate.strong());
    }
}
