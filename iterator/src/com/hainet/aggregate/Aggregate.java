package com.hainet.aggregate;

import com.hainet.iterator.Iterator;

// Aggregate Role
public interface Aggregate {

    int size();

    Iterator iterator();

    Object get(int index);
}
