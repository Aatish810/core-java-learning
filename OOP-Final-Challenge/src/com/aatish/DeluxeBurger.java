package com.aatish;

public class DeluxeBurger extends HamBurger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage", "Chicken", 75.5);
        // Since values are fixed we can directly set drink and chips as addition 1 and 2
        super.setOninon(true, 5.50);
        super.setTomato(true, 10.65);
    }

    @Override
    public void setTomato(boolean tomato, double price) {
        System.out.println("Not allowed i am overridden in Deluxe class");
    }

    @Override
    public void setCapcicum(boolean capcicum, double price) {
        System.out.println("Not allowed i am overridden in Deluxe class");
    }

    @Override
    public void setOninon(boolean oninon, double price) {
        System.out.println("Not allowed i am overridden in Deluxe class");
    }

    @Override
    public void setWhiteSause(boolean whiteSause, double price) {
        System.out.println("Not allowed i am overridden in Deluxe class");
    }
}
