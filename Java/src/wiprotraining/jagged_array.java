package wiprotraining;

import java.util.Scanner;

public class jagged_array{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter floors: ");
        int floors = scanner.nextInt();
        
        int[][] roomCapacity = new int[floors][];
        
        for (int i = 0; i < floors; i++) {
            System.out.print("Rooms on floor " + (i + 1) + ": ");
            int rooms = scanner.nextInt();
            roomCapacity[i] = new int[rooms];
            
            for (int j = 0; j < rooms; j++) {
                System.out.print("Beds in room " + (j + 1) + ": ");
                roomCapacity[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nTotal Floors and Beds are:");
        for (int i = 0; i < floors; i++) {
            int total = 0;
            for (int beds : roomCapacity[i]) {
                total += beds;
            }
            System.out.println("Floor " + (i + 1) + ": " + total + " beds");
        }
        
        scanner.close();
    }
}
