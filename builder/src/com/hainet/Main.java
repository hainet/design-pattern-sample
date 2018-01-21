package com.hainet;

// Client role
public class Main {

    public static void main(final String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        new Director(textBuilder).construct();

        System.out.println(textBuilder.result());
    }
}
