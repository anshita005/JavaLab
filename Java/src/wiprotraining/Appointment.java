package wiprotraining;
import java.util.Scanner;
import java.util.TreeSet;

public class Appointment{
    public static void main(String[] args) {
        TreeSet<String> appointments = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many appointments you want to add? ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter appointment date and time (yyyy-MM-dd HH:mm): ");
            String input = sc.nextLine();

            if (appointments.contains(input)) {
                System.out.println("Appointment already exists.");
            } else {
                appointments.add(input);
                System.out.println("Appointment added.");
            }
        }

        System.out.println("\nAppointments in Chronological Order:");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }

        sc.close();
    }
}
