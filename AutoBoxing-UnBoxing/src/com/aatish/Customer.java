package com.aatish;

import java.util.ArrayList;

public class Customer {
   private String name;
   private  ArrayList<Double> transaction;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transaction.add(amount);
    }
}
