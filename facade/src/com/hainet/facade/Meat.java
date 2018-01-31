package com.hainet.facade;

// Component role
public final class Meat {

    private boolean baked;

    public Meat() {
        this.baked = false;
    }

    public void eat() {
        if (this.baked) {
            System.out.println("Delicious baked meat!");
        } else {
            System.out.println("Bad stomach!");
        }
    }

    public void bake() {
        this.baked = true;
    }
}
