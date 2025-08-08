package wiprotraining;

import java.util.Scanner;

public class array_2D_practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of weeks: ");
        int weeks = scanner.nextInt();
        
        int[][] attendance = new int[weeks][5];
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        
  
        for (int i = 0; i < weeks; i++) {
            System.out.println("Week " + (i + 1) + " (1=Present, 0=Absent):");
            for (int j = 0; j < 5; j++) {
                System.out.print(days[j] + ": ");
                attendance[i][j] = scanner.nextInt();
            }
        }
        

        System.out.println("\nATTENDANCE:");
        int weekNumber = 1;
        int total = 0;
        
        for (int[] week : attendance) {
            System.out.print("Week " + weekNumber + ": ");
            for (int day : week) {
                System.out.print(day + " ");
                total += day;
            }
            System.out.println();
            weekNumber++;
        }
        
        System.out.println("Total Present: " + total + " days");
        
        scanner.close();
    }
}
