package com.hainet.strategy;

import com.hainet.Document;

// Concrete strategy role
public class HorizontalReadStrategy implements Strategy {

    @Override
    public void read(final Document document) {
        System.out.println("=== Horizontal read ===");
        for (final int i : document.getDocument()[0]) {
            System.out.println(i);
        }
    }
}
