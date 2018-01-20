package com.hainet;

import com.hainet.framework.Manager;
import com.hainet.framework.Product;

public class Main {

    public static void main(final String[] args) {
        final Manager manager = new Manager();

        manager.register("strong", new StrongMessage());
        manager.register("strike", new StrikeMessage());

        final Product strong = manager.create("strong");
        strong.use("This is strong message.");

        final Product strike = manager.create("strike");
        strike.use("This is strike message.");
    }
}
