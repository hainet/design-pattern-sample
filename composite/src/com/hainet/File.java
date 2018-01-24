package com.hainet;

// Leaf role
public class File implements Entry {

    private String name;

    private int size;

    public File(final String name, final int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void print(final String prefix) {
        System.out.println(prefix + "/" + this.getName() + "(" + this.getSize() + ")");
    }
}
