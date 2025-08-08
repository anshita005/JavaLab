package wiprotraining;

import java.util.Scanner;

public class discount_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter item price: Rs.");
        double price = scanner.nextDouble();
        
        double discount = 0;
        
        if (price >= 1000) {
            discount = price * 0.20; 
            System.out.println("Big purchase! 20% discount applied on your item");
        } else if (price >= 500) {
            discount = price * 0.10;
            System.out.println("Congratulations! 10% discount applied on your item");
        } else {
            System.out.println("Sorry,No discount is applied");
        }
        
        double finalPrice = price - discount;
        
        System.out.println("Original: Rs." + price);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Woahh! Final Price is: Rs." + finalPrice);
        
        scanner.close();
    }
}
