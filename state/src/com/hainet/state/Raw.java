package com.hainet.state;

import com.hainet.context.Context;

// Concrete state role
public final class Raw implements State {

    private static final Raw state;

    static {
        state = new Raw();
    }

    private Raw() {
    }

    public static Raw getState() {
        return state;
    }

    @Override
    public void setContext(final Context context, final int temperature) {
        if (temperature >= 70) {
            context.setState(Baked.getState());
        }
    }

    @Override
    public void eat() {
        System.out.println("Bad stomach!");
    }
}
