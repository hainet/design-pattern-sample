package com.hainet.singleton;

import java.util.Arrays;
import java.util.List;

// Singleton Role (There are two instances.)
public class Double {

    private static final List<Double> INSTANCES = Arrays.asList(
            new Double(0),
            new Double(1));

    private final int id;

    private Double(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Double getInstance(int id) {
        return INSTANCES.get(id);
    }
}
