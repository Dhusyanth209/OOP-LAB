
// Question 1: Define an abstract class Animal with an abstract method makeSound().
// Create two subclasses (Dog and Cat) that implement this method.

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}
