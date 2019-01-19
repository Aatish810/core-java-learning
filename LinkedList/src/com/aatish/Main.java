package com.aatish;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Basic arraylist and array example without Linked List
        Customer customer = new Customer("Aatish", 34.98);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(99.987);
        System.out.println("Balance in " + customer.getName() + " is " + customer.getBalance());
        // Since we have assigned customer to anotherCustomer both points to same location and hence
        // when we are changing value of anotherCustomer it is changing value of customer as well.
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        for(int i =0; i< intArray.size(); i++) {
            System.out.println("Values in array: " + intArray.get(i));
        }
        intArray.add(1, 4);
        for(int i =0; i< intArray.size(); i++) {
            System.out.println("New Values in array: " + intArray.get(i));
        }
        // In this code since we are pushing 4 at index 1 it leads to change address of value
        // at index 1 and push new value to index at 1. for few values it is ok but when number
        // of values increases it will slower process. So to avoid it we use Linked list
        // Demonstration in Demo Class
    }
}
