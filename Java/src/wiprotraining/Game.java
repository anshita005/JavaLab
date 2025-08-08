package wiprotraining;

import java.util.Scanner;

abstract class GameDemo {
    public abstract void start();
    public abstract void play();
    public abstract void end();
}

class CricketGame extends GameDemo {
    public void start() {
        System.out.println("Cricket Game Started!");
        System.out.println("Players are warming up...");
    }
    
    public void play() {
        System.out.println("Playing Cricket...");
        System.out.println("Batting and bowling in progress!");
    }
    
    public void end() {
        System.out.println("Cricket Game Ended!");
        System.out.println("Match result declared!");
    }
}

class FootballGame extends GameDemo {
    public void start() {
        System.out.println("Football Game Started!");
        System.out.println("Teams are entering the field...");
    }
    
    public void play() {
        System.out.println("Playing Football...");
        System.out.println("Players are kicking the ball!");
    }
    
    public void end() {
        System.out.println("Football Game Ended!");
        System.out.println("Final whistle blown!");
    }
}

class ChessGame extends GameDemo {
    public void start() {
        System.out.println("Chess Game Started!");
        System.out.println("Setting up the board...");
    }
    
    public void play() {
        System.out.println("Playing Chess...");
        System.out.println("Strategic moves in progress!");
    }
    
    public void end() {
        System.out.println("Chess Game Ended!");
        System.out.println("Checkmate achieved!");
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO GAME FRAMEWORK ===");
        System.out.println("Available Games:");
        System.out.println("1. Cricket Game");
        System.out.println("2. Football Game");
        System.out.println("3. Chess Game");
        System.out.print("Which game do you want to play? Enter choice: ");
        
        int choice = scanner.nextInt();
        GameDemo selectedGame;
        
        if (choice == 1) {
            selectedGame = new CricketGame();
            System.out.println("\nYou selected Cricket!");
        } else if (choice == 2) {
            selectedGame = new FootballGame();
            System.out.println("\nYou selected Football!");
        } else if (choice == 3) {
            selectedGame = new ChessGame();
            System.out.println("\nYou selected Chess!");
        } else {
            System.out.println("Invalid choice! Please select 1, 2, or 3.");
            scanner.close();
            return;
        }
        
        System.out.println("\n=== STARTING YOUR GAME ===");
        selectedGame.start();
        
        System.out.println("\n=== GAME IN PROGRESS ===");
        selectedGame.play();
        
        System.out.println("\n=== FINISHING GAME ===");
        selectedGame.end();
        
        System.out.println("\n=== GAME SESSION COMPLETED ===");
        System.out.println("Thank you for playing!");
        
        scanner.close();
    }
}