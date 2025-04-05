class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Bike is running.");
    }
}

public class RuntimePolymorphism1 {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.drive();
        v = new Bike();
        v.drive();
    }
}