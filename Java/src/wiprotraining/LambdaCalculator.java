package wiprotraining;

public class LambdaCalculator {
    

    interface MathOperation {
        int operate(int a, int b);
    }
    
    public static void main(String[] args) {
        
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        
        int x = 15;
        int y = 10;
        
        System.out.println("Numbers: " + x + " and " + y);
        System.out.println();
        
        System.out.println("Addition: " + x + " + " + y + " = " + addition.operate(x, y));
        System.out.println("Subtraction: " + x + " - " + y + " = " + subtraction.operate(x, y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + multiplication.operate(x, y));
    }
}
