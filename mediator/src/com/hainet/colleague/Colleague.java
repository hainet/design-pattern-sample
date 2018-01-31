package com.hainet.colleague;

import com.hainet.mediator.Mediator;

// Colleague role
public interface Colleague {

    void setMediator(Mediator mediator);

    void prepare();
}
