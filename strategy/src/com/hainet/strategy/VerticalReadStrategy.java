package com.hainet.strategy;

import com.hainet.Document;

// Concrete strategy role
public class VerticalReadStrategy implements Strategy {

    @Override
    public void read(final Document document) {
        System.out.println("=== Vertical read ===");
        for (final int[] lines : document.getDocument()) {
            System.out.println(lines[0]);
        }
    }
}
