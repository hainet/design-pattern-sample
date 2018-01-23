package com.hainet;

import com.hainet.strategy.Strategy;

// Context role
public class Reader {

    private final Strategy strategy;

    public Reader(final Strategy strategy) {
        this.strategy = strategy;
    }

    public void read(final Document document) {
        this.strategy.read(document);
    }
}
