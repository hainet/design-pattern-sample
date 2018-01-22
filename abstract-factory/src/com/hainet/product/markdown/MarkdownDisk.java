package com.hainet.product.markdown;

import com.hainet.product.Disk;

// Concrete product role
public class MarkdownDisk extends Disk {

    public MarkdownDisk(final String item) {
        super(item);
    }

    @Override
    public String create() {
        return "- " + super.item + "\n";
    }
}
