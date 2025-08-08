package com.healthcare;

public class TestHealthcare {
    public static void main(String[] args) {
       
        PatientServiceImpl service = new PatientServiceImpl();
        
        Patient p1 = new Patient(1, "Anshita", 22, "fever");
        Patient p2 = new Patient(2, "ABC", 25, "cold");
        
        System.out.println("--- Patient Registration ---");
        service.registerPatient(p1);  
        service.registerPatient(p2);

        service.showPatientDetails(1);
        service.showPatientDetails(2);
        
        GeneralPhysician gp = new GeneralPhysician("Sharma");
        System.out.println("\n--- Doctor Information ---");
        gp.displayInfo();
        
        System.out.println("\n--- Medical Consultations ---");
        System.out.println(gp.diagnose(p1)); 
        
        Patient registeredPatient = service.getPatient(1);
        if (registeredPatient != null) {
            System.out.println(gp.diagnose(registeredPatient));
        }
        
    }
}
