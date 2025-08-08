package wiprotraining;

public class encap_practice3 {
    private String name;
    private int age;
    private boolean hasVoted;
    
    public encap_practice3(String name, int age) {
        this.name = name;
        this.age = age;
        this.hasVoted = false;
    }
 
    public String getName() {
        return name;
    }
  
    public String vote(String candidate) {
        if (age < 18) {
            return "Too young to vote!";
        }
        if (hasVoted) {
            return "Already voted!";
        }
        hasVoted = true;
        return "Voted for " + candidate;
    }
    
    public void showStatus() {
        System.out.println(name + " (Age " + age + "): Voted = " + hasVoted);
    }
    
    public static void main(String[] args) {
        encap_practice3 voter1 = new encap_practice3("Anshita", 22);
        encap_practice3 voter2 = new encap_practice3("ABC", 16);
        
        System.out.println("VOTING RESULTS:");
        System.out.println(voter1.vote("Candidate A"));
        System.out.println(voter2.vote("Candidate B"));
        System.out.println(voter1.vote("Candidate C"));
        
        System.out.println("\nSTATUS:");
        voter1.showStatus();
        voter2.showStatus();
    }
}