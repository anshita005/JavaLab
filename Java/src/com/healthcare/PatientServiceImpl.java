package com.healthcare;
import java.util.HashMap;
import java.util.Map;

public class PatientServiceImpl implements PatientService {
    
    private Map<Integer, Patient> patients;
    
    public PatientServiceImpl() {
        patients = new HashMap<>();
    }

    @Override
    public void registerPatient(Patient patient) {
        patients.put(patient.getId(), patient); 
        System.out.println("Patient registered: " + patient.getName());
    }
    
    @Override
    public void showPatientDetails(int patientId) {
        Patient patient = patients.get(patientId);  
        
        if (patient != null) { 
            System.out.println("=== Patient Details ===");
            System.out.println("ID: " + patient.getId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Illness: " + patient.getIllness());
        } else { 
            System.out.println("Patient not found with ID: " + patientId);
        }
    }

	public Patient getPatient(int i) {
		return null; 
	}
    

}
