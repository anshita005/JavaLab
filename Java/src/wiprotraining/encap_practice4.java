package wiprotraining;

import java.util.Scanner;

 public class encap_practice4 {
    private String name;
    private int age;
    private String disease;
    
    public encap_practice4(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRecord(String doctor) {
        if (doctor.equals("Dr.Sharma")) {
            return name + " (Age " + age + ") has " + disease;
        }
        return "Access Denied";
    }
    
    public void showInfo() {
        System.out.println("Patient: " + name + " (Age " + age + ")");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient name: ");
        String name = scanner.next();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        System.out.print("Enter disease: ");
        String disease = scanner.next();
        
        encap_practice4 patient = new encap_practice4(name, age, disease);
        
        patient.showInfo();
        
        System.out.print("\nEnter doctor name to access record: ");
        String doctor = scanner.next();
        
        System.out.println("Result: " + patient.getRecord(doctor));  
        scanner.close();
    }
}

