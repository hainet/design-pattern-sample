package com.hainet.framework;

import java.util.HashMap;
import java.util.Map;

// Client role
public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(final String protoName, final Product proto) {
        showcase.put(protoName, proto);
    }

    public Product create(final String proto) {
        return showcase.get(proto);
    }
}
