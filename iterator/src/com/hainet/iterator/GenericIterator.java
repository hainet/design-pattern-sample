package com.hainet.iterator;

import com.hainet.aggregate.Aggregate;

// Generic Iterator Role
public class GenericIterator<T extends Aggregate> implements Iterator {

    private T aggregate;
    private int index = 0;

    public GenericIterator(final T aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.size();
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }

    @Override
    public boolean hasPrevious() {
        return index > 0;
    }

    @Override
    public Object previous() {
        return aggregate.get(--index);
    }
}
