package wiprotraining;

import java.util.Scanner;


public class patient_record {
    private String name;
    private int age;
    private String disease;
    
    public patient_record(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRecord(String doctor) {
        if (doctor.equals("Dr.Sharma")) {
            return name + " has " + disease;
        }
        return "Access Denied";
    }
    
    public void showInfo() {
        System.out.println("Patient: " + name + " (Age " + age + ")");
    }
    
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();
        manager.createPatient();
    }
}

 class HospitalManager {
    
    public void createPatient() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter disease: ");
        String disease = sc.next();
        

        patient_record patient = new patient_record(name, age, disease);
        patient.showInfo();
        System.out.println("Record: " + patient.getRecord("Dr.Sharma"));
        
        sc.close();
    }
}
