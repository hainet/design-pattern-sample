package com.hainet.component;

import com.hainet.facade.Egg;
import com.hainet.facade.Meat;

// Facade role
public final class Cook {

    public void serve() {
        final Meat meat = new Meat();
        meat.bake();
        meat.eat();

        final Egg egg = new Egg();
        egg.bake();
        egg.eat();
    }
}
