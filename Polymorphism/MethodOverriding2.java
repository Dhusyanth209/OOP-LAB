class Animal {
    void makeSound() {
        System.out.println("Animals make sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Animal a = new Dog(); // Dynamic method dispatch
        a.makeSound();
    }
}