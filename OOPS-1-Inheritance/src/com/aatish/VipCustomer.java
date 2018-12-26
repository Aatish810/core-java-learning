package com.aatish;

public class VipCustomer {

    private String name;
    private String accountNumber;
    private double accountBalance;

    // First Constructor for taking all values
    public VipCustomer() {
        this("1234567", 98078965.0);
        System.out.println("From first Constructor");
    }
    // Second Constructor
    public VipCustomer(String accountNumber, double accountBalance) {
        this(" Aatish Sharma",accountNumber,accountBalance);
        System.out.println("From second Constructor");
    }
    // Third Constructor
    public VipCustomer(String name,String accountNumber, double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.name = name;
        System.out.println("From Third Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}
