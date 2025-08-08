package wiprotraining;

public class encap_practice2 {
    private double balance;
    private String accountNumber;
    
    public encap_practice2(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    

    public static void main(String[] args) {
        encap_practice2 account = new encap_practice2("1234ABC");
        account.deposit(5000);
        account.withdraw(2000);
   
    }
}