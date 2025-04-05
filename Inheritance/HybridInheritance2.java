interface X {
    void showX();
}

interface Y {
    void showY();
}

class Z {
    void showZ() {
        System.out.println("Class Z method.");
    }
}

class W extends Z implements X, Y {
    public void showX() {
        System.out.println("Method from Interface X");
    }
    
    public void showY() {
        System.out.println("Method from Interface Y");
    }
}

public class HybridInheritance2 {
    public static void main(String[] args) {
        W obj = new W();
        obj.showX();
        obj.showY();
        obj.showZ();
    }
}