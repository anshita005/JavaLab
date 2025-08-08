package wiprotraining;

public class array_practice {

    public static void main(String[] args) {
        
  
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int[] temperature = {32, 35, 28, 30, 33};
        
  
        System.out.println("WEEKLY TEMPERATURE:");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + temperature[i] + "°C");
        }
        

        int hottest = 0;
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > temperature[hottest]) {
                hottest = i;
            }
        }
        
        System.out.println("\nHottest day: " + days[hottest] + " (" + temperature[hottest] + "°C)");
    }
}
