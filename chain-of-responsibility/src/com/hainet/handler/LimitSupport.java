package com.hainet.handler;

import com.hainet.component.Inquiry;

// Concrete handler role
public final class LimitSupport extends Support {

    private int limit;

    public LimitSupport(final String name, final int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(final Inquiry inquiry) {
        return inquiry.getName() <= limit;
    }
}
