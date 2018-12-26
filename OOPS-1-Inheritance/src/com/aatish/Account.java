package com.aatish;

// Example for pure getter and setter
public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }

    public void depositBalance(double amount) {
        this. balance = this.balance + amount;
        System.out.println("New balance in account " + this.balance);
    }

    public void debitBalance(double amount) {
        if(this.balance> amount) {
            this.balance = this.balance - amount;
            System.out.println("Remaining balance " + this.balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
