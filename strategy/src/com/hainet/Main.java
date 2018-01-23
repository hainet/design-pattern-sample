package com.hainet;

import com.hainet.strategy.HorizontalReadStrategy;
import com.hainet.strategy.VerticalReadStrategy;

public class Main {

    public static void main(final String[] args) {
        int[][] document = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        new Reader(new VerticalReadStrategy()).read(new Document(document));
        new Reader(new HorizontalReadStrategy()).read(new Document(document));
    }
}
