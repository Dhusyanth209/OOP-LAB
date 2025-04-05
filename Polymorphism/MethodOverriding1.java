class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class method.");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Parent p = new Child(); // Runtime polymorphism
        p.show();
    }
}