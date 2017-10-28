package com.hainet.file.adapter;

import com.hainet.file.target.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    public void readFromFile(final String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    public void writeToFile(final String fileName) throws IOException {
        store(new FileOutputStream(fileName), null);
    }

    public void setValue(final String key, final String value) {
        setProperty(key, value);
    }

    public String getValue(final String key) {
        return getProperty(key);
    }
}
