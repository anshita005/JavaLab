package com.healthcare;

public class GeneralPhysician extends Doctor {
    
    public GeneralPhysician(String name) {
        super(name, "General Treatment");  
    }
    
    @Override
    public String diagnose(Patient patient) {
        String diagnosis = "Dr. " + name + " diagnosed " + patient.getName() + ": ";
        
        String illness = patient.getIllness();
        if (illness.contains("fever")) {
            diagnosis += "Take paracetamol and rest";
        } else if (illness.contains("cold")) {
            diagnosis += "Drink warm fluids and rest";
        } else {
            diagnosis += "General treatment recommended";
        }
        
        return diagnosis;
    }
}