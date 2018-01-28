package com.hainet.handler;

import com.hainet.component.Inquiry;

// Concrete handler role
public final class OddSupport extends Support {

    public OddSupport(final String name) {
        super(name);
    }

    @Override
    protected boolean resolve(final Inquiry inquiry) {
        return inquiry.getName() % 2 == 1;
    }
}
