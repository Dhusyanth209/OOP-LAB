
// Question 6: Create an abstract class Account with an abstract method calculateInterest().
// Implement subclasses SavingsAccount and CurrentAccount with specific interest rate calculations.

abstract class Account {
    abstract double calculateInterest(double balance);
}

class SavingsAccount extends Account {
    double calculateInterest(double balance) {
        return balance * 0.04; // 4% interest rate
    }
}

class CurrentAccount extends Account {
    double calculateInterest(double balance) {
        return balance * 0.02; // 2% interest rate
    }
}

public class Question6 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount();
        System.out.println("Savings account interest: $" + savings.calculateInterest(1000));
        
        Account current = new CurrentAccount();
        System.out.println("Current account interest: $" + current.calculateInterest(1000));
    }
}
