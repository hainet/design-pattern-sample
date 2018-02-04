package com.hainet;

import com.hainet.context.Meat;

// Client role
public final class Main {

    public static void main(final String[] args) {
        final Meat meat = new Meat();

        for (int i=10; i<=100; i+=10) {
            meat.setTemperature(i);
            meat.eat();
        }
    }
}
