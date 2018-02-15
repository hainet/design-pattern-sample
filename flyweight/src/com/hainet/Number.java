package com.hainet;

// Flyweight role
public final class Number {

    private final String value;

    public Number(final int value) {
        this.value = String.valueOf(value);
    }

    public String toString() {
        return this.value;
    }
}
