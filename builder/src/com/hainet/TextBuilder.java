package com.hainet;

// Concrete builder role
public class TextBuilder implements Builder {

    private final StringBuilder builder = new StringBuilder();

    @Override
    public Builder id(final int id) {
        builder
                .append("id: ").append(id).append("\n");

        return this;
    }

    @Override
    public Builder name(final String name) {
        builder
                .append("name: ").append(name).append("\n");

        return this;
    }

    public String result() {
        return builder.toString();
    }
}
