package com.aatish;

public class Main {

    public static void main(String[] args) {

        // USing Base Class Hamburger
        HamBurger hamBurger = new HamBurger("Chicken Burger", "White Bread", "chicken", 50);
        double price = hamBurger.calculatePrice();
        hamBurger.setOninon(true, 2);
        price = hamBurger.calculatePrice();
        System.out.println(" 'Line 10' Total Bill = "  + price);

        hamBurger.setOninon(true, 2);
        hamBurger.setTomato(true, 5);
        price = hamBurger.calculatePrice();
        System.out.println(" 'Line 15' Total Bill = "  + price);

        // Applying HealthyBurger base class which extends HamBurger
        HealthyBurger healthyBurger = new HealthyBurger("mutton", 70);
        // Setting value in Base class for addition
        healthyBurger.setOninon(true, 10);
        healthyBurger.setCapcicum(true, 2.546);
        System.out.println("Cost of healthy burger: " + healthyBurger.calculatePrice());

        // Applying same in deluxe burger but as above we cannot call methods
        // of base class sine by ooverride we are preventing it
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        //below line will not set anything in base class above
        deluxeBurger.setCapcicum(true, 50);
        // calculte price is not over ridden so we can call directly base class method
        System.out.println("Cost of deluxe burger: " + deluxeBurger.calculatePrice());

    }
}
