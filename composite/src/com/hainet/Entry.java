package com.hainet;

// Component role
public interface Entry {

    String getName();

    int getSize();

    default Entry add(final Entry entry) {
        throw new RuntimeException();
    }

    default void print() {
        print("");
    }

    void print(String prefix);
}
