package com.hainet.generator;

import com.hainet.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject role
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(final Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();

    public abstract void generate();
}
