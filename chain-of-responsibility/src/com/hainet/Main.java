package com.hainet;

import com.hainet.component.Inquiry;
import com.hainet.handler.LimitSupport;
import com.hainet.handler.NoSupport;
import com.hainet.handler.OddSupport;
import com.hainet.handler.Support;

// Client role
public final class Main {

    public static void main(final String[] args) {
        final Support chain = new NoSupport("chain");
        final Support of = new OddSupport("of");
        final Support responsibility = new LimitSupport("responsibility", 7);

        chain
                .setNext(of)
                .setNext(responsibility);

        for (int i=1; i<= 10; i++) {
            chain.support(new Inquiry(i));
        }
    }
}
