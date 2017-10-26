package com.hainet.iterator;

// Aggregate Role
public interface Aggregate {
    int size();

    Iterator iterator();

    Object get(int index);
}
