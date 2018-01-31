package com.hainet.colleague;

import com.hainet.mediator.Mediator;

// Concrete colleague role
public final class Skillet implements Colleague {

    private Mediator mediator;

    private boolean prepared = false;

    private boolean heated = false;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void prepare() {
        this.prepared = true;
    }

    public void heat() {
        if (this.prepared) {
            this.heated = true;
            this.mediator.tell();
        }
    }

    public boolean isHeated() {
        return this.heated;
    }
}
