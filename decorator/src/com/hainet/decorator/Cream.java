package com.hainet.decorator;

import com.hainet.component.Cake;

// Concrete decorator role
public final class Cream extends Topping {

    public Cream(final Cake cake) {
        super(cake);
    }

    @Override
    public String get() {
        return super.cake.get() + " wrapped in cream";
    }
}
