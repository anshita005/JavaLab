package com.banking;
import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService {
    
    private Map<Integer, Account> accounts = new HashMap<>();
    
    @Override
    public void createAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println(" Account created successfully!");
        System.out.println("  Account Number: " + account.getAccountNumber());
        System.out.println("  Account Holder: " + account.getHolderName());
        System.out.println("  Account Type: " + account.getAccountType());
        System.out.println("  Initial Balance: $" + account.getBalance());
    }
    
    @Override
    public void showAccountDetails(int accountNumber) {
        Account account = accounts.get(accountNumber);
        
        if (account != null) {
            System.out.println("=== Account Details ===");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Current Balance: $" + account.getBalance());
            System.out.println("========================");
        } else {
            System.out.println(" Account not found with number: " + accountNumber);
        }
    }
    
    @Override
    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        
        if (account != null && amount > 0) {
            double oldBalance = account.getBalance();
            account.setBalance(oldBalance + amount);
            System.out.println(" Deposit Successful!");
            System.out.println("  Account Number: " + accountNumber);
            System.out.println("  Deposited Amount: $" + amount);
            System.out.println("  Previous Balance: $" + oldBalance);
            System.out.println("  New Balance: $" + account.getBalance());
        }
    }
    
    @Override
    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        
        if (account != null && amount > 0 && account.getBalance() >= amount) {
            double oldBalance = account.getBalance();
            account.setBalance(oldBalance - amount);
            System.out.println("  Withdrawal Successful!");
            System.out.println("  Account Number: " + accountNumber);
            System.out.println("  Withdrawn Amount: $" + amount);
            System.out.println("  Previous Balance: $" + oldBalance);
            System.out.println("  New Balance: $" + account.getBalance());
        }
    }
    
    public void showAllAccounts() {
        System.out.println("\nAll Bank Accounts Details");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts.values()) {
                System.out.println("Account " + account.getAccountNumber() + 
                                 ": " + account.getHolderName() + 
                                 " (" + account.getAccountType() + ") - $" + account.getBalance());
            }
        }
        System.out.println("==========================");
    }
}
