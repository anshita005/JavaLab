package com.banking;

public class MainBankSystem {
    public static void main(String[] args) {
        
        BankServiceImpl bankService = new BankServiceImpl();
        
   
        Account acc1 = new Account(1001, "Anshita", 5000.0, "Savings");
        Account acc2 = new Account(1002, "ABC", 2500.0, "Current");
        Account acc3 = new Account(1003, "XYZ", 1000.0, "Savings");
        
        System.out.println("--- Account Creation ---");
        bankService.createAccount(acc1);
        System.out.println();
        bankService.createAccount(acc2);
        System.out.println();
        bankService.createAccount(acc3);
        
        System.out.println("\n--- Individual Account Details ---");
        bankService.showAccountDetails(1001);
        System.out.println();
        bankService.showAccountDetails(1002);
        
        System.out.println("\n--- Deposit Operations ---");
        bankService.deposit(1001, 1500.0);
        System.out.println();
        bankService.deposit(1002, 750.0);
        
  
        System.out.println("\n--- Withdrawal Operations ---");
        bankService.withdraw(1001, 2000.0);
        System.out.println();
        bankService.withdraw(1003, 500.0);
        System.out.println();
        bankService.withdraw(1003, 800.0); 
       
        System.out.println("\n--- Updated Account Details ---");
        bankService.showAccountDetails(1001);
        System.out.println();
        bankService.showAccountDetails(1003);
         
        bankService.showAllAccounts();   
        
    }
}
