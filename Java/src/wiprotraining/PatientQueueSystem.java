package wiprotraining;

import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueueSystem {

	public static void main(String[] args) {
		LinkedList<String> patientList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
 
		while (true) {
			System.out.println("\n--- Patient Queue System ---");
			System.out.println("1. Add Patient (Normal)");
			System.out.println("2. Add Patient (Emergency)");
			System.out.println("3. Cancel the Appointment");
			System.out.println("4. View All Patients");
			System.out.println("5. Check Next and Last Patient");
			System.out.println("6. Exit");

			System.out.print("Choose option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter patient name: ");
				String normalPatient = sc.nextLine();
				patientList.addLast(normalPatient);
				System.out.println("Patient added at end.");
				break;

			case 2:
				System.out.print("Enter emergency patient name: ");
				String emergencyPatient = sc.nextLine();
				patientList.addFirst(emergencyPatient);
				System.out.println("Emergency patient added at front.");
				break;
			case 3:
				System.out.print("Enter name to remove: ");
				String removeName = sc.nextLine();
				boolean removed = patientList.remove(removeName);
				if (removed) {
					System.out.println("Patient removed.");
				} else {
					System.out.println("Patient not found.");
				}
				break;

			case 4:
				if (patientList.isEmpty()) {
					System.out.println("No patients in queue.");
				} else {
					System.out.println("Patients in queue:");
					for (String patient : patientList) {
						System.out.println("- " + patient);
					}
				}
				break;

			case 5:
				if (!patientList.isEmpty()) {
					System.out.println("First: " + patientList.getFirst());
					System.out.println("Last: " + patientList.getLast());
				} else {
					System.out.println("Queue is empty.");
				}
				break;

			case 6:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		
		}
	}
}
