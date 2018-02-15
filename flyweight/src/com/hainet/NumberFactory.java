package com.hainet;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory role
public final class NumberFactory {

    private Map<String, Number> pool;

    {
        this.pool = new HashMap<>();
    }

    private static final NumberFactory FACTORY = new NumberFactory();

    private NumberFactory() {

    }

    public static final NumberFactory create() {
        return FACTORY;
    }

    public Number getNumber(final int value) {
        final Number number = pool.get(value);

        if (number == null) {
            return new Number(value);
        }

        return number;
    }
}
