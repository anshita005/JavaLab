package wiprotraining;

import java.util.Scanner;

public class array_2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] numbers = new int[rows][cols];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter number [" + i + "][" + j + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }
        
        int sum = 0;
        
        System.out.println("\nYour 2D Array:");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
                sum += num;
            }
            System.out.println();
        }
        
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}
