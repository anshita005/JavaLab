package wiprotraining;
import java.util.HashSet;
import java.util.Scanner;

class Patient {
	private int id;
	private String name;
	private String disease;

	public Patient(int id, String name, String disease) {
		this.id = id;
		this.name = name;
		this.disease = disease;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Patient))
			return false;
		Patient other = (Patient) o;
		return this.id == other.id;
	}

	public int hashcode() {

		return Integer.hashCode(id);
	}

	public String toString() {
		return "Patient ID: " + id + " , Name: " + name + " , Disease: " + disease;
	}

}

public class HashSet_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Patient> patientSet = new HashSet<>();
		while (true) {
			System.out.println("Hospital Registration System");
			System.out.println("\n1. Register new patient");
			System.out.println("2. View All Reg patients");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
				case 1:
					System.out.print("Enter Patient ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Patient Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Patient Disease: ");
					String disease = sc.nextLine();

					Patient p = new Patient(id, name, disease);
					if (patientSet.add(p)) {
						System.out.println("Patient registered successfully.");
				
					} else {
						patientSet.add(p);
						System.out.println("Patient already registered!");
					}
					break;

				case 2:
					System.out.println("Registered Patients:");
					for (Patient patient : patientSet) {
						System.out.println(patient);
					}
					break;

				case 3:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice.");
			}
		}	
	}
}
