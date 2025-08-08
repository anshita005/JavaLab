package wiprotraining;

public class loops {
    
    public static void main(String[] args) {
        String patientName = "Anshita";
        double[] temperatures = {98.6, 99.2, 100.5, 98.9}; 
        System.out.println("Checking temperature for " + patientName);
  
        for (int i = 0; i < 4; i++) {
            double temp = temperatures[i];
            
            System.out.print("Hour " + (i + 1) + ": " + temp + "°F - ");
            
            if (temp > 100) {
                System.out.println("HIGH");
            } else {
                System.out.println("NORMAL");
            }
        }
        
        System.out.println("Temperature testing done!");
    }
}
