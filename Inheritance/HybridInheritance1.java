interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }
    
    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

public class HybridInheritance1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}