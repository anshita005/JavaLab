package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
}

public class PatientManagement {
    static ArrayList<Patient> patientList = new ArrayList<>();
    static int idCounter = 1;

    public static void addPatient(String name, String disease) {
        Patient newPatient = new Patient(idCounter++, name, disease);
        patientList.add(newPatient);
        System.out.println("Patient added.");
    }

    public static void viewAllPatients() {
        if (patientList.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patientList) {
                System.out.println("ID: " + p.id + ", Name: " + p.name + ", Disease: " + p.disease);
            }
        }
    }

    public static void getPatientByIndex(int index) {
        if (index >= 0 && index < patientList.size()) {
            Patient p = patientList.get(index);
            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Disease: " + p.disease);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void updatePatientDisease(int index, String newDisease) {
        if (index >= 0 && index < patientList.size()) {
            patientList.get(index).disease = newDisease;
            System.out.println("Disease updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void removePatientByIndex(int index) {
        if (index >= 0 && index < patientList.size()) {
            patientList.remove(index);
            System.out.println("Patient removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void removePatientByName(String name) {
        boolean removed = patientList.removeIf(p -> p.name.equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Patient(s) removed.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void showTotalPatients() {
        System.out.println("Total patients: " + patientList.size());
    }

    public static void clearAllRecords() {
        patientList.clear();
        System.out.println("All records cleared.");
    }

    public static void findFirstLastIndex(String name) {
        int first = -1, last = -1;
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).name.equalsIgnoreCase(name)) {
                if (first == -1) first = i;
                last = i;
            }
        }
        if (first == -1) {
            System.out.println("Patient not found.");
        } else {
            System.out.println("First Index: " + first + ", Last Index: " + last);
        }
    }

    public static void checkIfListEmpty() {
        System.out.println(patientList.isEmpty() ? "Patient list is empty." : "Patient list is not empty.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    addPatient(name, disease);
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    getPatientByIndex(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new disease: ");
                    String newDis = sc.nextLine();
                    updatePatientDisease(updateIndex, newDis);
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    removePatientByIndex(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter name: ");
                    removePatientByName(sc.nextLine());
                    break;
                case 7:
                    showTotalPatients();
                    break;
                case 8:
                    clearAllRecords();
                    break;
                case 9:
                    System.out.print("Enter name: ");
                    findFirstLastIndex(sc.nextLine());
                    break;
                case 10:
                    checkIfListEmpty();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 11);

        sc.close();
    }
}
