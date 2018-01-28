package com.hainet.handler;

import com.hainet.component.Inquiry;

public final class NoSupport extends Support {

    public NoSupport(final String name) {
        super(name);
    }

    @Override
    public boolean resolve(final Inquiry inquiry) {
        return false;
    }
}
