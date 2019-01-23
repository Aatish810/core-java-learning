package com.aatish;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " Cannot fly long distances");
    }
}
