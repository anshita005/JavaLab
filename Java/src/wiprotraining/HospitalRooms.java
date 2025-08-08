package wiprotraining;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class HospitalRooms {
    public static void main(String[] args) {
        TreeSet<LocalDateTime> appointments = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.print("How many appointments you want to book? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter appointment date and time (dd-MM-yyyy HH:mm): ");
            String input = sc.nextLine();
            LocalDateTime dt = LocalDateTime.parse(input, formatter);

            if (appointments.contains(dt)) {
                System.out.println("Appointment already exists.");
            } else {
                appointments.add(dt);
                System.out.println("Appointment Booked Sucessfully.");
            }
        }

        System.out.println("\nAppointments in Chronological Order:");
        for (LocalDateTime a : appointments) {
            System.out.println(a.format(formatter));
        }

        sc.close();
    }
}
