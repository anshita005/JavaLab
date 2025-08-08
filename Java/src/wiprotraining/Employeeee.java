package wiprotraining;

import java.util.Scanner;

public class Employeeee {
    
    private String employeeName;
    private int employeeId;
    
    public Employeeee() {
        this.employeeName = "Default Employee";
        this.employeeId = 0;
        System.out.println("Default constructor called!");
    }

    public Employeeee(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
        System.out.println("Parameterized constructor called! " + name);
    }

    public static class StaticClass {
        public static int add(int a, int b) {
            return a + b;
        }
    }

    void Message() {
        System.out.println("Hello " + this.employeeName + " (ID: " + this.employeeId + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        scanner.close();

        System.out.println("Result: " + Employeeee.StaticClass.add(first, second));
        
        Employeeee emp1 = new Employeeee();
        emp1.Message();
        
        Employeeee emp2 = new Employeeee("Anshita", 101);
        emp2.Message();
    }
}
