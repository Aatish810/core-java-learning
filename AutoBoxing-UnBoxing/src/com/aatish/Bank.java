package com.aatish;

import java.util.ArrayList;

public class Bank {
    private  String name;
   private ArrayList<Branches> branches;

   public Bank(String name) {
       this.name = name;
       this.branches = new ArrayList<Branches>();
   }

   public boolean addBranch(String name) {
       if(findBranch(name) == null) {
           this.branches.add(new Branches(name));
           return true;
       }
       return false;
   }

   public boolean addCustomer(String branch, String customer, double amount) {
       Branches existingBranch = findBranch(branch);
       if(existingBranch != null) {
          return existingBranch.newCustomer(customer, amount);
       }
       return false;
   }

   public boolean addCustomerTransaction(String branch, String customer, double amount) {
       Branches existingBranch = findBranch(branch);
       if(existingBranch != null) {
           return existingBranch.addCustomerTranasction(customer, amount);
       }
       return false;
   }

   private Branches findBranch(String name) {
       for(int i=0; i< this.branches.size(); i++) {
           Branches checkedBranch = this.branches.get(i);
           if(checkedBranch.getName().equals(name)) {
               return checkedBranch;
           }
       }
       return null;
   }

   public boolean listCustomers(String branchName, boolean showTransaction) {
       Branches branch = findBranch(branchName);
       if(branch != null) {
           System.out.println("Branch name " + branch.getName());
           ArrayList<Customer> branchCustomers = branch.getCustomer();
           for(int i=0; i< branchCustomers.size(); i++) {
               Customer branchCustomer = branchCustomers.get(i);
               System.out.println("Customer list " + branchCustomer);
               if(showTransaction) {
                ArrayList<Double> transactions = branchCustomer.getTransaction();
                for(int j=0; j < transactions.size(); i++) {
                    System.out.println("Amount " + transactions.get(j));
                }
               }
           }
           return true;
       }
       return false;
   }
}
