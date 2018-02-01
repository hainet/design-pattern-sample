package com.hainet.observer;

import com.hainet.generator.NumberGenerator;

// Observer role
public interface Observer {

    void update(NumberGenerator generator);
}
