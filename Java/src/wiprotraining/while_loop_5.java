package wiprotraining;

import java.util.Scanner;

public class while_loop_5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Password Validate
        System.out.println("1. PASSWORD VALIDATOR");
        String correctPassword = "admin123";
        String enteredPassword = "";
        while (!enteredPassword.equals(correctPassword)) {
            System.out.print(" Enter password: ");
            enteredPassword = scanner.next();
            if (!enteredPassword.equals(correctPassword)) {
                System.out.println(" Wrong password! Try again.");
            }
        }
        System.out.println(" Access granted!\n");

        // 2. ATM Withdrawal
        System.out.println("2. ATM WITHDRAWAL");
        double balance = 5000.0;
        double withdraw = 1;
        while (balance > 0 && withdraw != 0) {
            System.out.println(" Current balance: " + balance);
            System.out.print(" Enter amount to withdraw (0 to exit): ");
            withdraw = scanner.nextDouble();
            if (withdraw > 0 && withdraw <= balance) {
                balance -= withdraw;
                System.out.println(" Withdrawn: " + withdraw);
            } else if (withdraw > balance) {
                System.out.println(" Insufficient funds!");
            }
        }
        System.out.println(" Final balance: " + balance + "\n");

        // 3. Age Verification
        System.out.println("4. AGE VERIFICATION");
        int age = 0;
        while (age < 18 || age > 30) {
            System.out.print(" Enter your age (18-100): ");
            age = scanner.nextInt();
            if (age < 18) {
                System.out.println(" Too young! Must be 18+ Badminton Training ");
            } else if (age > 100) {
                System.out.println(" Invalid age! Must be under 30 for Badminton Training");
            }
        }
        System.out.println(" Age verified: " + age + " years old\n");

        // 3. Shopping Cart
        System.out.println("5. SHOPPING CART");
        double total = 0;
        double price = 1;
        while (price != 0) {
            System.out.print(" Enter item price (0 to finish): ");
            price = scanner.nextDouble();
            if (price > 0) {
                total += price;
                System.out.println(" Item added. Current total: " + total);
            }
        }
        System.out.println(" Final cart total: " + total);

        scanner.close();
    }
}
