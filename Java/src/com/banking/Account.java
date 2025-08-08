package com.banking;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private String accountType;
    
    public Account(int accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public void setBalance(double balance) { this.balance = balance; }
}
