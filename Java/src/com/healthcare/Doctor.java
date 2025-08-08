package com.healthcare;

public abstract class Doctor {

    protected String name;
    protected String specialization;
    
  
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
   
    public abstract String diagnose(Patient patient);
    
    public void displayInfo() {
        System.out.println("Dr. " + name + " - " + specialization);
    }
   
}

