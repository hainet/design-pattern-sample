package com.hainet.abstraction;

import com.hainet.implementor.PrintImpl;

// Refined abstraction role
public class MultiPrint extends Print {

    public MultiPrint(final PrintImpl impl) {
        super(impl);
    }

    public void multiRun(final int times) {
        for (int i = 1; i <= times; i++) {
            super.run();
        }
    }
}
