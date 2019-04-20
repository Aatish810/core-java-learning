package com.aatish;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This runs once before any test case");
    }

    @org.junit.Before
    public void setUp() {
      account = new BankAccount("Aatish", "Sharma", 1000.00, BankAccount.CHECKING);
        System.out.println("This runs before every test case");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_noBranch()
    {
        double balance = account.withdraw(600.00, false);
    }
    @org.junit.Test
    public void getBalance_deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        double balance = account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        boolean check = account.isChecking();
        assertTrue("The account is Checking", check);
    }

    @org.junit.After
    public void setUp_After() {
        System.out.println("This runs after every test case");
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This runs once after all test case");
    }
}