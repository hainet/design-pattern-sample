package com.hainet.implementor;

// Concrete implementor role
public class DiskPrint implements PrintImpl {

    private final String item;

    public DiskPrint(final String item) {
        this.item = item;
    }

    @Override
    public void rawOpen() {
        System.out.println("=== open ===");
    }

    @Override
    public void rawPrint() {
        System.out.println("・" + this.item);
    }

    @Override
    public void rawClose() {
        System.out.println("=== close ===");
    }
}
