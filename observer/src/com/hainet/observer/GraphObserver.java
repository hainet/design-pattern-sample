package com.hainet.observer;

import com.hainet.generator.NumberGenerator;

// Concrete observer role
public final class GraphObserver implements Observer {

    @Override
    public void update(final NumberGenerator generator) {
        System.out.print(this.getClass().getSimpleName() + " ");
        for (int i = 1; i <= generator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
