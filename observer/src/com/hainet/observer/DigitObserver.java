package com.hainet.observer;

import com.hainet.generator.NumberGenerator;

// Concrete observer role
public final class DigitObserver implements Observer {

    @Override
    public void update(final NumberGenerator generator) {
        System.out.println(this.getClass().getSimpleName() + " " + generator.getNumber());
    }
}
