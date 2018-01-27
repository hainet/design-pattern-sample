package com.hainet;

import com.hainet.component.SpongeCake;
import com.hainet.decorator.Cream;
import com.hainet.decorator.Strawberry;

public final class Main {

    public static void main(final String[] args) {
        final SpongeCake spongeCake = new SpongeCake("sponge cake");
        spongeCake.eat();

        final Cream creamCake = new Cream(spongeCake);
        creamCake.eat();

        final Strawberry strawberryCreamCake = new Strawberry(creamCake);
        strawberryCreamCake.eat();
    }
}
