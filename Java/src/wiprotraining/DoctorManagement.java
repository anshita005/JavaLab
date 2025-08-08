package wiprotraining;
import java.util.HashSet;
import java.util.Scanner;

class Doctor {
    private int licenseNumber;
    private String name;
    private String department;

    public Doctor(int licenseNumber, String name, String department) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.department = department;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor other = (Doctor) o;
        return this.licenseNumber == other.licenseNumber;
    }

    public int hashCode() {
        return Integer.hashCode(licenseNumber);
    }
    public String toString() {
        return "License No: " + licenseNumber + ", Name: " + name + ", Department: " + department;
    }
}

public class DoctorManagement{

    public static void main(String[] args) {
        HashSet<Doctor> registeredDoctors = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add New Doctor");
            System.out.println("2. Show All Registered Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter License Number: ");
                    int license = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Doctor Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    Doctor newDoctor = new Doctor(license, name, dept);
                    if (registeredDoctors.add(newDoctor)) {
                        System.out.println("Doctor added successfully!");
                    } else {
                        System.out.println("Doctor already registered with this license number.");
                    }
                    break;

                case 2:
                    System.out.println("\nRegistered Doctors:");
                    for (Doctor d : registeredDoctors) {
                        System.out.println(d);
                    }
                    break;

                case 3:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
