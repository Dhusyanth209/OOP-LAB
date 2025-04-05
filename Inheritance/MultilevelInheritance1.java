class Grandparent {
    void legacy() {
        System.out.println("Grandparent's legacy.");
    }
}

class Parent extends Grandparent {
    void guidance() {
        System.out.println("Parent's guidance.");
    }
}

class Child extends Parent {
    void future() {
        System.out.println("Child's future.");
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.legacy();
        c.guidance();
        c.future();
    }
}