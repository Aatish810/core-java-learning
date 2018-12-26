package com.aatish;

public class Main {

    public static void main(String[] args) {
	// Example for Getter and setter using class Account and method calling till line 17
//       Account account = new Account();
//       account.setAccountNumber("12345");
//       account.setBalance(100000.0);
//       account.setEmail("aatish@email.com");
//       account.setName("Aatish Sharma");
//       account.setPhone("9876543210");
//        System.out.println("Account Number " + account.getAccountNumber());
//        System.out.println("Account Balance " + account.getBalance());
//        account.debitBalance(5000.0);
//        account.depositBalance(4500.0);

     // Constructor practice and concepts usind VipCustomer class till line 22
//        VipCustomer vip = new VipCustomer();
//        System.out.println(vip.getAccountBalance() + " Account Balance");
//        System.out.println(vip.getAccountNumber() + " Account Number");
//        System.out.println(vip.getName() + " Name");

    // Concept of inheritance and its challenge

        //Inheritance Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
