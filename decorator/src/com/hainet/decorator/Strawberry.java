package com.hainet.decorator;

import com.hainet.component.Cake;

// Concrete decorator role
public final class Strawberry extends Topping {

    public Strawberry(final Cake cake) {
        super(cake);
    }

    @Override
    public String get() {
        return super.cake.get() + " with strawberries";
    }
}
