package com.hainet;

import com.hainet.component.Cook;
import com.hainet.facade.Egg;
import com.hainet.facade.Meat;

// Client role
public final class Main {

    public static void main(final String[] args) {
        new Meat().eat();

        new Egg().eat();

        new Cook().serve();
    }
}
