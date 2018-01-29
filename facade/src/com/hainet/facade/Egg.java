package com.hainet.facade;

// Component role
public final class Egg {

    private boolean baked;

    public Egg() {
        this.baked = false;
    }

    public void eat() {
        if (this.baked) {
            System.out.println("Delicious baked egg!");
        } else {
            System.out.println("Bad stomach!");
        }
    }

    public void bake() {
        this.baked = true;
    }
}
