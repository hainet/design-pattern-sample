package com.hainet.abstraction;

import com.hainet.implementor.PrintImpl;

import java.util.Random;

// Refined abstraction role
public class RandomPrint extends Print {

    public RandomPrint(final PrintImpl impl) {
        super(impl);
    }

    public void randomRun(final int max) {
        for (int i = 1; i <= new Random().nextInt(max); i++) {
            super.run();
        }
    }
}
