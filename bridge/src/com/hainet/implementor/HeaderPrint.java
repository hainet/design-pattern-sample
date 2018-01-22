package com.hainet.implementor;

// Concrete implementor role
public class HeaderPrint implements PrintImpl {

    private final String item;

    public HeaderPrint(final String item) {
        this.item = item;
    }

    @Override
    public void rawOpen() {
        System.out.println("=== open ===");
    }

    @Override
    public void rawPrint() {
        System.out.println("【" + item + "】");
    }

    @Override
    public void rawClose() {
        System.out.println("=== close ===");
    }
}
