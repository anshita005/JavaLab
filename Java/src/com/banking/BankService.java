package com.banking;

public interface BankService {
    void createAccount(Account account);
    void showAccountDetails(int accountNumber);
    void deposit(int accountNumber, double amount);
    void withdraw(int accountNumber, double amount);
}
