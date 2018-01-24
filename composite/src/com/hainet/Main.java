package com.hainet;

// Client role
public class Main {

    public static void main(final String[] args) {
        Directory root = new Directory("root");
        Directory users = new Directory("Users");
        Directory hainet = new Directory("hainet");

        root
                .add(new File("README.md", 100))
                .add(users);

        users
                .add(hainet);

        hainet
                .add(new File("composite.yml", 10));

        root.print();
    }
}
