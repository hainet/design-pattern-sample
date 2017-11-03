package com.hainet.singleton;

// Singleton Role
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
        System.out.println("Singleton instance is created.");
    }

    public static Singleton getSingleton() {
        return SINGLETON;
    }
}
