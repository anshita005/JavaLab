package wiprotraining;

import java.util.*;

class Patients {
    private int id;
    private String name;
    private String disease;

    public Patients(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }
}

public class HospitalMap {
    public static void main(String[] args) {
        HashMap<Integer, Patients> patientMap = new HashMap<>();


        Patients p1 = new Patients(101, "Anshita", "Fever");
        Patients p2 = new Patients(201, "Riya", "Cold");
        Patients p3 = new Patients(301, "Shri", "Injury");

        patientMap.put(p1.getId(), p1);
        patientMap.put(p2.getId(), p2);
        patientMap.put(p3.getId(), p3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID to retrieve patient: ");
        int searchId = sc.nextInt();

        if (patientMap.containsKey(searchId)) {
            Patients p = patientMap.get(searchId);
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Disease: " + p.getDisease());
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("\nAll Patients:");
        for (Patients p : patientMap.values()) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Disease: " + p.getDisease());
        }

        System.out.println("\nTotal Patients: " + patientMap.size());

        System.out.print("\nEnter ID to check if exists: ");
        int checkId = sc.nextInt();
        System.out.println(patientMap.containsKey(checkId));

        System.out.print("\nEnter ID to remove: ");
        int removeId = sc.nextInt();
        patientMap.remove(removeId);
        System.out.println("Removed ID " + removeId + ". Remaining count is: " + patientMap.size());

        patientMap.clear();
        System.out.println("All cleared. Total Patients now: " + patientMap.size());
        sc.close(); 
    }
}
