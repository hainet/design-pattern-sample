package com.hainet;

import com.hainet.framework.AbstractProduct;

// Concrete prototype role
public class StrikeMessage extends AbstractProduct {

    @Override
    public void use(final String message) {
        System.out.println("~~" + message + "~~");
    }
}
