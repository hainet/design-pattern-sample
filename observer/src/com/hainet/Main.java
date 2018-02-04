package com.hainet;

import com.hainet.generator.NumberGenerator;
import com.hainet.generator.RandomNumberGenerator;
import com.hainet.observer.DigitObserver;
import com.hainet.observer.GraphObserver;

public final class Main {

    public static void main(final String[] args) {
        final NumberGenerator generator = new RandomNumberGenerator();

        final DigitObserver digitObserver = new DigitObserver();
        final GraphObserver graphObserver = new GraphObserver();

        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);

        generator.generate();
    }
}
