package com.aatish;

public class HamBurger {

    private String name;
    private String rollType;
    private String meat;
    private double price;

    public HamBurger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    private boolean tomato;
    private double tomatoPrice;

    private boolean capcicum;
    private double capcicumPrice;

    private boolean onion;
    private double oninonPrice;

    private boolean whilteSauce;
    private double whiteSausePrice;


    public void setTomato(boolean tomato, double price) {
        this.tomato = tomato;
        this.setTomatoPrice(price);
    }

    private void setTomatoPrice(double tomatoPrice) {
        this.tomatoPrice = tomatoPrice;
    }

    public void setCapcicum(boolean capcicum, double price) {
        this.capcicum = capcicum;
        this.setCapcicumPrice(price);
    }

    private void setCapcicumPrice(double capcicumPrice) {
        this.capcicumPrice = capcicumPrice;
    }

    public void setOninon(boolean oninon, double price) {
        this.onion = oninon;
        this.setonionPrice(price);
    }

    private void setonionPrice(double price) {
        this.oninonPrice = price;
    }

    public void setWhiteSause(boolean whiteSause, double price) {
        this.whilteSauce = whiteSause;
        this.setWhilteSaucePrice(price);
    }

    private void setWhilteSaucePrice(double price) {
        this.whiteSausePrice = price;
    }

    public double calculatePrice() {
        double totalBill = this.price;
        System.out.println("Cost of burger = " + this.price);
        if(this.onion == true) {
         totalBill += this.oninonPrice;
            System.out.println("Cost of Onion = " + this.oninonPrice);
        }
        if(this.capcicum == true) {
            totalBill += this.capcicumPrice;
            System.out.println("Cost of capcicum = " + this.capcicumPrice);
        }
        if(this.whilteSauce == true) {
            totalBill += this.whiteSausePrice;
            System.out.println("Price of WS = " + this.whiteSausePrice);
        }
        if(this.tomato == true) {
            totalBill += this.tomatoPrice;
            System.out.println("Tomato price =" + this.tomatoPrice);
        }
        return totalBill;
    }

}
