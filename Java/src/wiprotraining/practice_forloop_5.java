package wiprotraining;

import java.util.Scanner;

public class practice_forloop_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Grocery Bill
        System.out.println("1. GROCERY BILL");
        System.out.print("Number of items: ");
        int itemCount = scanner.nextInt();
        double totalBill = 0;
        for (int i = 1; i <= itemCount; i++) {
            System.out.print(" Price of item " + i + ": ");
            totalBill += scanner.nextDouble();
        }
        System.out.println(" Total bill: " + totalBill + "\n");

        // 2. Attendance Checker
        System.out.println("2. ATTENDANCE CHECKER");
        System.out.print("Number of students: ");
        int studentCount = scanner.nextInt();
        int present = 0;
        for (int i = 1; i <= studentCount; i++) {
            System.out.print(" Student " + i + " present? (y/n): ");
            char ch = scanner.next().charAt(0);
            if (ch == 'y' || ch == 'Y') present++;
        }
        System.out.println(" Total present: " + present + "\n");

        // 3. Battery Monitor
        System.out.println("3. BATTERY MONITOR");
        System.out.print("Number of hours to log: ");
        int hours = scanner.nextInt();
        for (int i = 1; i <= hours; i++) {
            System.out.print(" Hour " + i + " battery %: ");
            int battery = scanner.nextInt();
            System.out.println("  Logged: " + battery + "%");
        }
        System.out.println();



        scanner.close();
    }
}
