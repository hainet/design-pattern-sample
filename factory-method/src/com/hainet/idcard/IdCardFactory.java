package com.hainet.idcard;

import com.hainet.framework.Factory;
import com.hainet.framework.Product;

// Concrete Factory Role
public class IdCardFactory extends Factory {

    private int id = 1;

    @Override
    public Product create(final String owner) {
        return new IdCard(id++, owner);
    }
}
