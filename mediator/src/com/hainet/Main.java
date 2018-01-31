package com.hainet;

import com.hainet.colleague.Egg;
import com.hainet.colleague.Meat;
import com.hainet.colleague.Plate;
import com.hainet.colleague.Skillet;
import com.hainet.mediator.Cook;

public final class Main {

    public static void main(final String[] args) {
        final Skillet skillet = new Skillet();
        final Meat meat = new Meat();
        final Egg egg = new Egg();
        final Plate plate = new Plate();

        final Cook cook = new Cook(skillet, meat, egg, plate);

        skillet.heat();
        meat.bake();
        egg.bake();
        plate.dish();
    }
}
