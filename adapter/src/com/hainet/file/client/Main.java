package com.hainet.file.client;

import com.hainet.file.adapter.FileProperties;
import com.hainet.file.target.FileIO;

import java.io.IOException;

public class Main {

    private static final String PATH = new StringBuilder()
            .append(System.getProperty("user.dir"))
            .append("/adapter/src/com/hainet/file")
            .toString();

    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try {
            f.readFromFile(PATH + "/before.txt");

            f.setValue("Language", "Java");
            System.out.println(f.getValue("Language"));
            f.setValue("Design Pattern", "Adapter");

            f.writeToFile(PATH + "/after.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
