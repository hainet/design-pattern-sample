package com.hainet.generator;

import java.util.Random;

// Concrete subject role
public final class RandomNumberGenerator extends NumberGenerator {

    private Random random;

    private int number;

    {
        random = new Random();
        number = 0;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void generate() {
        this.number = random.nextInt(50);
        super.notifyObservers();
    }
}
