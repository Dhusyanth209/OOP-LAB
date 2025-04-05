class Animal {
    void live() {
        System.out.println("Animals live.");
    }
}

class Mammal extends Animal {
    void characteristics() {
        System.out.println("Mammals give birth to young ones.");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("Humans can think.");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Human h = new Human();
        h.live();
        h.characteristics();
        h.think();
    }
}