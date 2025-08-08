package wiprotraining;

import java.util.Scanner;

class Employee {
    String name;
    
    public void showDetails() {
        System.out.println("Employee name: " + this.name);
    }
    
    public void work() {
        System.out.println(this.name + " is working");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        this.name = name;
    }
    
    public void work() {
        showDetails(); 
        System.out.println(this.name + " is managing team");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        this.name = name;
    }
    
    public void work() {
        showDetails();
        System.out.println(this.name + " is writing code");
    }
}

public class EmployeeChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("1.Manager 2.Developer Choose: ");
        int choice = scanner.nextInt();
        
        Employee emp;
        
        if (choice == 1) {
            emp = new Manager(name);
        } else {
            emp = new Developer(name);
        }
        
        emp.work();
        
        scanner.close();
    }
}
