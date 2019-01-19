package com.aatish;

import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customer> customer;

    public Branches(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String name, double amount){
        if(findCustomer(name) == null) {
            this.customer.add(new Customer(name, amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTranasction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    private Customer findCustomer(String name) {
        for(int i =0; i< this.customer.size(); i++) {
            Customer checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
