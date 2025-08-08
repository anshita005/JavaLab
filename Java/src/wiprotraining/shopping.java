package wiprotraining;

public class shopping {
    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private String category;
    
    // Static variables
    static double shippingCost = 8.99;
    static int totalOrders = 0;
    
    // Constructor
    public shopping(String name, double cost, int qty, String cat) {
        productName = name; 
        price = cost;
        quantity = qty;
        category = cat;
        totalOrders++;
    }
    

    public void processCheckout() {
        // Local variables
        double subtotal = price * quantity;
        double discount = 0;
        double finalAmount = subtotal;
        
        // Switch statement for category-based discounts
        switch (category.toLowerCase()) {
            case "electronics":
                discount = subtotal * 0.05;
                break;
            case "clothing":
                discount = subtotal * 0.10;
                break;
            case "books":
                discount = subtotal * 0.15;
                break;
            case "home":
                discount = subtotal * 0.08;
                break;
            default:
                discount = subtotal * 0.02;
        }
        
        finalAmount -= discount;
        
        // If-else for shipping charges
        if (finalAmount >= 499) {
            System.out.println("Free shipping applied");
        } else {
            finalAmount += shippingCost;
        }

        // If-else for bulk order bonus
        if (quantity >= 10) {
            discount += 20; 
            finalAmount -= 20;
        } else if (quantity >= 5) {
            discount += 10;
            finalAmount -= 10;
        }
        
        System.out.println("Product: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total Discount: " + discount);
        System.out.println("Final Amount: " + String.format("%.2f", finalAmount));
    }
    
    public static void main(String[] args) {
        shopping order_1 = new shopping("Watch", 3999.99, 1, "electronics");
        shopping order_2 = new shopping("Bottle", 25.50, 6, "grocery");
        shopping order_3 = new shopping("DSA", 45.00, 12, "books");
        
        System.out.println("=== ORDER 1 ===");
        order_1.processCheckout();
        
        System.out.println("\n=== ORDER 2 ===");
        order_2.processCheckout();
        
        System.out.println("\n=== ORDER 3 ===");
        order_3.processCheckout();
        
        System.out.println("\nTotal Orders: " + totalOrders);
    }
}
