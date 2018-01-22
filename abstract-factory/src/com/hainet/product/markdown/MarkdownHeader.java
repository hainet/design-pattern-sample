package com.hainet.product.markdown;

import com.hainet.product.Header;

// Concrete product role
public class MarkdownHeader extends Header {

    public MarkdownHeader(final String item) {
        super(item);
    }

    @Override
    public String create() {
        return "# " + super.item + "\n";
    }
}
