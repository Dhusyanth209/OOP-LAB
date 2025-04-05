
// Question 8: Create an abstract class Payment with an abstract method processPayment().
// Implement subclasses CreditCardPayment and PayPalPayment that define their own payment processing.

abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Question8 {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        credit.processPayment(150.75);
        
        Payment paypal = new PayPalPayment();
        paypal.processPayment(80.50);
    }
}
