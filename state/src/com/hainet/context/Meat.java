package com.hainet.context;

import com.hainet.state.Raw;
import com.hainet.state.State;

// Concrete context role
public final class Meat implements Context {

    private State state = Raw.getState();

    @Override
    public void setState(final State state) {
        this.state = state;
    }

    @Override
    public void setTemperature(final int temperature) {
        this.state.setContext(this, temperature);
    }

    @Override
    public void eat() {
        this.state.eat();
    }
}
