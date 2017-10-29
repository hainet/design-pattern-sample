package com.hainet.template;

// Template Role
public abstract class Display {

    public final void display() {
        open();
        print();
        close();
    }

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();
}
