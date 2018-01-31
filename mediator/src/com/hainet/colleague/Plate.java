package com.hainet.colleague;

import com.hainet.mediator.Mediator;

// Concrete colleague role
public final class Plate implements Colleague {

    private Mediator mediator;

    private boolean prepared = false;

    private boolean dished = false;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void prepare() {
        this.prepared = true;
    }

    public void dish() {
        if (this.prepared) {
            this.dished = true;
            this.mediator.tell();
        }
    }

    public boolean isDished() {
        return this.dished;
    }
}
