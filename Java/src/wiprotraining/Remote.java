package wiprotraining;

import java.util.Scanner;

abstract class RemoteDemo {
    public abstract void turnOn();
    public abstract void turnOff();
}

class TVRemote extends RemoteDemo {
    public void turnOn() {
        System.out.println("TV turned ON");
    }
    
    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

class ACRemote extends RemoteDemo {
    public void turnOn() {
        System.out.println("AC turned ON");
    }
    
    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}

class FanRemote extends RemoteDemo {
    public void turnOn() {
        System.out.println("Fan turned ON");
    }
    
    public void turnOff() {
        System.out.println("Fan turned OFF");
    }
}

public class Remote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        RemoteDemo tv = new TVRemote();
        RemoteDemo ac = new ACRemote();
        RemoteDemo fan = new FanRemote();
        
        System.out.println("Which remote do you want to turn ON?");
        System.out.println("1. TV Remote");
        System.out.println("2. AC Remote");
        System.out.println("3. Fan Remote");
        System.out.print("Choose: ");
        
        int onChoice = scanner.nextInt();
        
        if (onChoice == 1) {
            tv.turnOn();
        } else if (onChoice == 2) {
            ac.turnOn();
        } else if (onChoice == 3) {
            fan.turnOn();
        } else {
            System.out.println("Invalid choice!");
        }
        
        System.out.println();

        System.out.println("Which remote do you want to turn OFF?");
        System.out.println("1. TV Remote");
        System.out.println("2. AC Remote");
        System.out.println("3. Fan Remote");
        System.out.print("Choose: ");
        
        int offChoice = scanner.nextInt();
        
        if (offChoice == 1) {
            tv.turnOff();
        } else if (offChoice == 2) {
            ac.turnOff();
        } else if (offChoice == 3) {
            fan.turnOff();
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
