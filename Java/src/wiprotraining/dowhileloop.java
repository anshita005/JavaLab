package wiprotraining;

import java.util.Scanner;

public class dowhileloop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello Anshita");
        System.out.print("Please Enter number of doses needed: ");
        int doses = scanner.nextInt();
        
        int dosesTaken = 0;
       
        do {
            dosesTaken++;
           
            System.out.println("\nReminder: Please Take medicine");
            doses--;
            System.out.println("Dose " + dosesTaken + " completed, Doses left: " + doses);
            System.out.println("Medicine taken, Please Wait for another reminder");
            System.out.println("---");
        } while (doses > 0);
        
        System.out.println("Congratulations, You have taken all medicines and total doses taken: " + dosesTaken);
        
        scanner.close();
    }
}
