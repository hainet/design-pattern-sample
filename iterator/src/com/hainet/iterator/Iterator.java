package com.hainet.iterator;

// Iterator Role
public interface Iterator {

    boolean hasNext();
    Object next();

    boolean hasPrevious();
    Object previous();
}
