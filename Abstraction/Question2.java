
// Question 2: Create an abstract class Vehicle with an abstract method maxSpeed().
// Implement two subclasses (Car and Bike) that provide their own implementation of maxSpeed().

abstract class Vehicle {
    abstract int maxSpeed();
}

class Car extends Vehicle {
    int maxSpeed() {
        return 200;
    }
}

class Bike extends Vehicle {
    int maxSpeed() {
        return 100;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car max speed: " + car.maxSpeed() + " km/h");
        
        Vehicle bike = new Bike();
        System.out.println("Bike max speed: " + bike.maxSpeed() + " km/h");
    }
}
