package com.hainet.context;

import com.hainet.state.State;

// Context role
public interface Context {

    void setState(State state);

    void setTemperature(int temperature);

    void eat();
}
