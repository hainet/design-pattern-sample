package com.hainet.colleague;

import com.hainet.mediator.Mediator;

// Concrete colleague role
public final class Egg implements Colleague {

    private Mediator mediator;

    private boolean prepared = false;

    private boolean baked = false;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void prepare() {
        this.prepared = true;
    }

    public void bake() {
        if (this.prepared) {
            this.baked = true;
            this.mediator.tell();
        }
    }

    public boolean isBaked() {
        return this.baked;
    }
}
