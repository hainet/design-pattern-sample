package com.hainet;

import java.util.ArrayList;
import java.util.List;

// Flyweights role
public final class Numbers {

    private List<Number> numbers;

    {
        this.numbers = new ArrayList<>();
    }

    public Numbers(final List<Integer> values) {
        values.forEach(value -> numbers.add(NumberFactory.create().getNumber(value)));
    }

    public void print() {
        numbers.forEach(System.out::print);
        System.out.println();
    }
}
