package com.hainet.framework;

// Cloneable.clone()がインターフェースで利用出来ないためabstractクラスで実装
public abstract class AbstractProduct implements Product {

    @Override
    public Product createClone() {
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
