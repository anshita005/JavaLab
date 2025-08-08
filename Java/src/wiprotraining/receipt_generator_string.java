package wiprotraining;
import java.util.Scanner;

public class receipt_generator_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder report = new StringBuilder();
        
        System.out.println("=== EMPLOYEE PROFILE GENERATOR ===");
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        

        report.append("Name: ").append(name).append("\n");
        report.append("ID: ").append(id).append("\n");
        report.append("Department: ").append(dept).append("\n");
        report.append("Salary: ₹").append(String.format("%.2f", salary)).append("\n");
        report.append("Status: Active").append("\n");
        

        report.append("Generated Date: ").append("July 22, 2025").append("\n");
        report.append("System: Employee Management");
        

        String result = report.toString().replace("Status: Active", "Status:  ACTIVE");
        
        System.out.println("\n" + result);
        System.out.println("\nCongratulations, Profile generated successfully!");
        
        sc.close();
    }
}