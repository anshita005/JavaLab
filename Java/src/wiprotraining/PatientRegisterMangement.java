package wiprotraining;

import java.util.HashSet;
import java.util.Scanner;

public class PatientRegisterMangement {

    public static void main(String[] args) {
        HashSet<Integer> registeredPatients = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register New Patient (Enter ID)");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Remove a Patient");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID to register: ");
                    int id = Integer.parseInt(sc.nextLine());
                    registeredPatients.add(id); 
                    if (registeredPatients.add(id)) {
                        System.out.println("Patient registered successfully.");
                    } else {
                        System.out.println("This patient ID is already registered!");
                    }
                    break;
                case 2:
                    if (registeredPatients.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("Registered Patient IDs: " + registeredPatients);
                    }
                    break;

                case 3:
                    System.out.print("Enter patient ID to remove: ");
                    int removeID = Integer.parseInt(sc.nextLine());
                    
                    if (registeredPatients.contains(removeID)) {
                    	if(registeredPatients.remove(removeID)) {
                        System.out.println("Patient removed successfully.");
                    	}
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
