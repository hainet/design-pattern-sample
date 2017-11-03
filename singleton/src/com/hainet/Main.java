package com.hainet;

import com.hainet.singleton.Counter;
import com.hainet.singleton.Double;
import com.hainet.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        // Singleton
        Singleton instance1 = Singleton.getSingleton();
        Singleton instance2 = Singleton.getSingleton();

        System.out.println(instance1 == instance2);

        // Counter
        Counter counter = Counter.getInstance();

        for (int i=1; i<=5; i++) {
            System.out.println(counter.getCount());
        }

        // Double
        Double one = Double.getInstance(0);
        Double two = Double.getInstance(1);

        System.out.println(one == two);
    }
}
