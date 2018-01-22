package com.hainet.product.text;

import com.hainet.product.Disk;

public class TextDisk extends Disk {

    public TextDisk(final String item) {
        super(item);
    }

    @Override
    public String create() {
        return "・" + super.item + "\n";
    }
}
