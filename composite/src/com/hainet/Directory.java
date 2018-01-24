package com.hainet;

import java.util.ArrayList;
import java.util.List;

// Composite role
public class Directory implements Entry {

    private String name;

    private List<Entry> entries = new ArrayList<>();

    public Directory(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.entries.stream()
                .mapToInt(Entry::getSize)
                .sum();
    }

    @Override
    public Entry add(final Entry entry) {
        this.entries.add(entry);

        return this;
    }

    @Override
    public void print(final String prefix) {
        System.out.println(prefix + "/" + this.getName() + "(" + this.getSize() + ")");
        this.entries.forEach(entry -> entry.print(prefix + "/" + this.getName()));
    }
}
