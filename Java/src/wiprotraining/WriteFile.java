package wiprotraining;
import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        	BufferedWriter bw = new BufferedWriter(  new FileWriter("C:/Users/anshi/Desktop/Patients.txt", true));


            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            
            bw.write("ID: " + id + ", Name: " + name + ", Disease: " + disease + ", Age: " + age);
            bw.newLine();

            System.out.println("Patient record saved successfully.");
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        sc.close();
    }
}
