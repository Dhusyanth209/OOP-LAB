class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    void show(double d) {
        System.out.println("Double: " + d);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);
        d.show("Hello");
        d.show(10.5);
    }
}