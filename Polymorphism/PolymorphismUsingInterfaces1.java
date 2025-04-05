interface Animal {
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class PolymorphismUsingInterfaces1 {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.makeSound();
        a = new Dog();
        a.makeSound();
    }
}