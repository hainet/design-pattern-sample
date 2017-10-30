package com.hainet;

import com.hainet.framework.Factory;
import com.hainet.framework.Product;
import com.hainet.idcard.IdCardFactory;

import java.util.ArrayList;
import java.util.List;

// Client Role
public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();

        List<Product> products = new ArrayList<>();
        products.add(factory.create("Java"));
        products.add(factory.create("Design Pattern"));
        products.add(factory.create("Factory Method"));

        products.forEach(it -> it.use());
    }
}
