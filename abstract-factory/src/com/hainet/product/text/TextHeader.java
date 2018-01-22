package com.hainet.product.text;

import com.hainet.product.Header;

// Concrete product role
public class TextHeader extends Header {

    public TextHeader(final String item) {
        super(item);
    }

    @Override
    public String create() {
        return "【" + super.getItem() + "】\n";
    }
}
