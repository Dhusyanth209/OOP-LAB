class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterestRate() {
        return 5;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 7;
    }
}

public class RuntimePolymorphism2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");
        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");
    }
}