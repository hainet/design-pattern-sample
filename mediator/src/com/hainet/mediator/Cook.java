package com.hainet.mediator;

import com.hainet.colleague.Egg;
import com.hainet.colleague.Meat;
import com.hainet.colleague.Plate;
import com.hainet.colleague.Skillet;

// Concrete mediator role
public final class Cook implements Mediator {

    private Skillet skillet;

    private Meat meat;

    private Egg egg;

    private Plate plate;

    public Cook(
            final Skillet skillet,
            final Meat meat,
            final Egg egg,
            final Plate plate) {
        this.skillet = skillet;
        this.skillet.setMediator(this);
        this.skillet.prepare();
        this.meat = meat;
        this.meat.setMediator(this);
        this.egg = egg;
        this.egg.setMediator(this);
        this.plate = plate;
        this.plate.setMediator(this);
    }

    public void tell() {
        if (this.skillet.isHeated()) {
            this.meat.prepare();
            this.egg.prepare();
        }

        if (this.meat.isBaked() && this.egg.isBaked()) {
            this.plate.prepare();
        }

        if (this.plate.isDished()) {
            System.out.println("Enjoy your meal!");
        }
    }
}
