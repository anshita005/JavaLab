package wiprotraining;

import java.util.Scanner;

public class atmcashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 5000.98;
        
        System.out.println("Your Current ATM  Balance: Rs." + balance);
        System.out.println("1. Withdraw  2. Deposit");
        System.out.print("Choose Any one: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Withdraw amount: Rs.");
            double amount = scanner.nextDouble();
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: Rs." + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else{
            System.out.print("Deposit amount: Rs.");
            double amount = scanner.nextDouble();
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        }
        // HERE IS THE NEW ATM BALANCE 
        System.out.println("New balance: Rs." + balance);
        
        scanner.close();
    }
}
