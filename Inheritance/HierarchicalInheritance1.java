class Vehicle {
    void move() {
        System.out.println("Vehicles can move.");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Cars can move fast.");
    }
}

class Bike extends Vehicle {
    void balance() {
        System.out.println("Bikes need balance.");
    }
}

public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        c.speed();
        
        Bike b = new Bike();
        b.move();
        b.balance();
    }
}