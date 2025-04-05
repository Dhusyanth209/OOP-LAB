
// Question 5: Define an abstract class Appliance with an abstract method turnOn().
// Implement subclasses WashingMachine and Refrigerator that define their turnOn() method.

abstract class Appliance {
    abstract void turnOn();
}

class WashingMachine extends Appliance {
    void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }
}

class Refrigerator extends Appliance {
    void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine();
        wm.turnOn();
        
        Appliance fridge = new Refrigerator();
        fridge.turnOn();
    }
}
