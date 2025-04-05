
// Question 7: Define an abstract class Device with an abstract method connect().
// Implement subclasses Laptop and Mobile that define their own connect() behavior.

abstract class Device {
    abstract void connect();
}

class Laptop extends Device {
    void connect() {
        System.out.println("Laptop is connecting to Wi-Fi.");
    }
}

class Mobile extends Device {
    void connect() {
        System.out.println("Mobile is connecting to Mobile Network.");
    }
}

public class Question7 {
    public static void main(String[] args) {
        Device laptop = new Laptop();
        laptop.connect();
        
        Device mobile = new Mobile();
        mobile.connect();
    }
}
