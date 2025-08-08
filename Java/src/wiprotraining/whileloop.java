package wiprotraining;

public class whileloop {
    
    public static void main(String[] args) {
        String patientName = "Anshita";
        int heartbeat = 45; 
        
        System.out.println("Checking " + patientName + "'s heartbeat...");
        
     
        while (heartbeat < 60 || heartbeat > 100) {
            System.out.println("Heartbeat: " + heartbeat + " bpm.  - Not normal, It's high");
            heartbeat += 10; 
        }
        
        System.out.println("Heartbeat: " + heartbeat + " bpm. - Normal!");
        System.out.println(patientName + " is stable.");
    }
}
