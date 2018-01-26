package com.hainet.decorator;

import com.hainet.component.Cake;

// Decorator role
public abstract class Topping implements Cake {

    protected Cake cake;

    protected Topping(final Cake cake) {
        this.cake = cake;
    }
}
