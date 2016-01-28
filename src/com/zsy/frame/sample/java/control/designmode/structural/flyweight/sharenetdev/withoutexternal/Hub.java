package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withoutexternal;

public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void use() {
        System.out.println("Linked by Hub, type is " + this.type);
    }
}