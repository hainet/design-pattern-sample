package com.hainet;

import com.hainet.abstraction.MultiPrint;
import com.hainet.abstraction.Print;
import com.hainet.abstraction.RandomPrint;
import com.hainet.implementor.DiskPrint;
import com.hainet.implementor.HeaderPrint;

// Client role
public class Main {

    public static void main(final String[] args) {
        Print print = new Print(new DiskPrint("print"));
        print.run();

        Print headerPrint = new Print(new HeaderPrint("headerPrint"));
        headerPrint.run();

        MultiPrint multiPrint = new MultiPrint(new DiskPrint("multiPrint"));
        multiPrint.multiRun(3);

        RandomPrint randomPrint = new RandomPrint(new DiskPrint("randomPrint"));
        randomPrint.randomRun(3);
    }
}
