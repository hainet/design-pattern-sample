package com.hainet.handler;

import com.hainet.component.Inquiry;

// Handler role
public abstract class Support {

    private String supporter;

    private Support next;

    protected Support(final String supporter) {
        this.supporter = supporter;
    }

    public Support setNext(final Support next) {
        this.next = next;

        return next;
    }

    public final void support(final Inquiry inquiry) {
        if (resolve(inquiry)) {
            done(inquiry);
        } else if (next != null) {
            this.next.support(inquiry);
        } else {
            failed(inquiry);
        }
    }

    protected abstract boolean resolve(Inquiry inquiry);

    private void done(final Inquiry inquiry) {
        System.out.println(inquiry.getName() + " is resolved by " + this.supporter + ".");
    }

    private void failed(final Inquiry inquiry) {
        System.out.println(inquiry.getName() + " can not be resolved.");
    }
}
