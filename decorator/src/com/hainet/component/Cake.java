package com.hainet.component;

// Component role
public interface Cake {

    String get();

    default void eat() {
        System.out.println("Let's eat " + this.get() + "!");
    }
}
