package wiprotraining;

abstract class Payment {
    public abstract void makePayment();
    public abstract void showMethod();
}

class DebitCard extends Payment {
    public void makePayment() {
        System.out.println("Payment done with Debit Card");
    }
    
    public void showMethod() {
        System.out.println("Method: Debit Card");
    }
}

class GooglePay extends Payment {
    public void makePayment() {
        System.out.println("Payment done with Google Pay");
    }
    
    public void showMethod() {
        System.out.println("Method: Google Pay");
    }
}

class NetBanking extends Payment {
    public void makePayment() {
        System.out.println("Payment done with Net Banking");
    }
    
    public void showMethod() {
        System.out.println("Method: Net Banking");
    }
}

public class SimplePayment {
    public static void main(String[] args) {

        Payment debit = new DebitCard();
        Payment gpay = new GooglePay(); 
        Payment banking = new NetBanking();
        
        debit.showMethod();
        debit.makePayment();
        
        gpay.showMethod();
        gpay.makePayment();
        
        banking.showMethod();
        banking.makePayment();
    }
}
