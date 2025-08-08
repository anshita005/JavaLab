package PatientAppointment;

import java.util.*;

class Appointment {
    private String patientName;
    private String doctorName;
    private String disease;
    private String time;  

    public Appointment(String patientName, String doctorName, String disease, String time) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.disease = disease;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String toString() {
        return "Patient: " + patientName + ", Doctor: " + doctorName + ", disease: " + disease + ", Time: " + time;
    }
}

public class HospitalManagement {

    private static TreeMap<Integer, Appointment> appointments = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Appointment Scheduler");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. View Earliest and Latest Appointment");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Appointment ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    System.out.print("Enter Appointment Time: ");
                    String time = sc.nextLine();

                    appointments.put(id, new Appointment(pname, dname, disease, time));
                    System.out.println("Appointment Added.");
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        System.out.println("\nScheduled Appointments:");
                        for (Integer key : appointments.keySet()) {
                            System.out.println("ID: " + key + " -> " + appointments.get(key));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Appointment ID to remove: ");
                    int removeId = sc.nextInt();
                    if (appointments.remove(removeId) != null) {
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("No such appointment.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Existing Appointment ID: ");
                    int oldId = sc.nextInt();
                    sc.nextLine();
                    if (appointments.containsKey(oldId)) {
                        Appointment appt = appointments.remove(oldId);
                        System.out.print("Enter New Appointment ID: ");
                        int newId = sc.nextInt();
                        appointments.put(newId, appt);
                        System.out.println("Appointment rescheduled.");
                    } else {
                        System.out.println("No such appointment to reschedule.");
                    }
                    break;

                case 5:
                    if (!appointments.isEmpty()) {
                        Integer firstKey = appointments.firstKey();
                        Integer lastKey = appointments.lastKey();
                        System.out.println("Earliest Appointment (by ID): ID "  + appointments.get(firstKey));
                        System.out.println("Latest Appointment   (by ID): ID "  + appointments.get(lastKey));
                    } else {
                        System.out.println("No appointments scheduled.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...r.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
