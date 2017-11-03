package com.hainet.singleton;

// Singleton Role
public class Counter {

    private static final Counter COUNTER = new Counter();
    private int count = 1;

    private Counter() {
        System.out.println("Counter instance is created.");
    }

    public static Counter getInstance() {
        return COUNTER;
    }

    public int getCount() {
        return count++;
    }
}
