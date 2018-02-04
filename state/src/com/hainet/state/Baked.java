package com.hainet.state;

import com.hainet.context.Context;

// Concrete state role
public final class Baked implements State {

    private static final Baked state;

    static {
        state = new Baked();
    }

    private Baked() {
    }

    public static Baked getState() {
        return state;
    }

    @Override
    public void setContext(final Context context, final int temperature) {
        if (temperature < 70) {
            context.setState(Raw.getState());
        }
    }

    @Override
    public void eat() {
        System.out.println("Delicious!");
    }
}
