package wiprotraining;

public class string_methods {

    public static void main(String[] args) {
        String name = "Anshita Sharma";
        String name2 = "anshita sharma";
        
        System.out.println("=== 25 STRING METHODS ===");
        

        System.out.println("1. length(): " + name.length());
        System.out.println("2. charAt(2): " + name.charAt(2));
        System.out.println("3. substring(0,7): " + name.substring(0,7));
        System.out.println("4. indexOf('a'): " + name.indexOf('a'));
        System.out.println("5. lastIndexOf('a'): " + name.lastIndexOf('a'));
        
 
        System.out.println("6. toUpperCase(): " + name.toUpperCase());
        System.out.println("7. toLowerCase(): " + name.toLowerCase());
        System.out.println("8. equals(): " + name.equals(name2));
        System.out.println("9. equalsIgnoreCase(): " + name.equalsIgnoreCase(name2));
        System.out.println("10. compareTo(): " + name.compareTo("Anshita"));
        
    
        System.out.println("11. startsWith('An'): " + name.startsWith("An"));
        System.out.println("12. endsWith('ma'): " + name.endsWith("ma"));
        System.out.println("13. contains('Shar'): " + name.contains("Shar"));
        System.out.println("14. isEmpty(): " + name.isEmpty());
        System.out.println("15. isBlank(): " + "   ".isBlank());
        

        System.out.println("16. replace('a','@'): " + name.replace('a','@'));
        System.out.println("17. replaceAll('[aeiou]','*'): " + name.replaceAll("[aeiou]","*"));
        System.out.println("18. trim(): '" + "  Anshita  ".trim() + "'");
        System.out.println("19. concat(' Hi'): " + name.concat(" Hi"));
        

        System.out.println("20. split(' ')[0]: " + name.split(" ")[0]);
        System.out.println("21. split(' ')[1]: " + name.split(" ")[1]);
        System.out.println("22. repeat(2): " + "Hi ".repeat(2));

    }
}
