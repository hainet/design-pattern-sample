package com.hainet.factory.text;

import com.hainet.factory.Factory;
import com.hainet.product.Disk;
import com.hainet.product.Header;
import com.hainet.product.text.TextDisk;
import com.hainet.product.text.TextHeader;

// Concrete factory role
public class TextFactory extends Factory {

    @Override
    public Header createHeader(final String item) {
        return new TextHeader(item);
    }

    @Override
    public Disk createDisk(final String item) {
        return new TextDisk(item);
    }
}
