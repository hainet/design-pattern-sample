package com.hainet.factory.markdown;

import com.hainet.factory.Factory;
import com.hainet.product.Disk;
import com.hainet.product.Header;
import com.hainet.product.markdown.MarkdownDisk;
import com.hainet.product.markdown.MarkdownHeader;

public class MarkdownFactory extends Factory {

    @Override
    public Header createHeader(final String item) {
        return new MarkdownHeader(item);
    }

    @Override
    public Disk createDisk(final String item) {
        return new MarkdownDisk(item);
    }
}
