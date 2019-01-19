package com.aatish;

import java.util.ArrayList;

//public class IntArrayList {
//    public IntArrayList(int intValue) {
//        this.intValue = intValue;
//    }
//
//    private int intValue;
//
//}
public class Main {

    public static void main(String[] args) {
	    // ArrayList doesnot support primitive datatype as interfaces. So we have to create out our class to use
        // primitive data type. Example shown below to use int type.
       // ArrayList<int> intArray = new ArrayList<int>(); --> this line will give error so we need to create class
        // make this work.
        // Fix for ablove line is

//        ArrayList<IntArrayList> intValue = new ArrayList<IntArrayList>();
//        intValue.add(new IntArrayList(50));


       // Instead of doing so much we can make use of AutoBoxing and unboxing.
//        ArrayList<Integer> intValue = new ArrayList<Integer>();
//        intValue.add(Integer.valueOf(50));
//        intValue.get(0).intValue();
        // Short way of doing same is
//        intValue.add(10); // --> In this line also same this is done only difference is it is done by compiler
//        intValue.get(1); // automatically.

        // Same thin for double data type.
//        ArrayList<Double> doubleValue = new ArrayList<Double>();
//        doubleValue.add(Double.valueOf(40.09));
//        doubleValue.get(0).doubleValue();// Short way of doing same as above

//        doubleValue.add(45.00);
//        doubleValue.get(1);
        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
