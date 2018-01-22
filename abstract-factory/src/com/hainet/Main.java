package com.hainet;

// Client role
import com.hainet.factory.Factory;

public class Main {

    public static void main(final String[] args) {
        final Factory markdownFactory = Factory.getFactory("com.hainet.factory.markdown.MarkdownFactory");

        System.out.println(markdownFactory.createHeader("This is header.").create()
                + markdownFactory.createDisk("List 1").create()
                + markdownFactory.createDisk("List 2").create());

        final Factory textFactory = Factory.getFactory("com.hainet.factory.text.TextFactory");

        System.out.println(textFactory.createHeader("This is header.").create()
                + textFactory.createDisk("List 1").create()
                + textFactory.createDisk("List 2").create());
    }
}
