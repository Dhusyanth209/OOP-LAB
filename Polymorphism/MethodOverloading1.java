class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading1 {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println("Sum of integers: " + mo.add(5, 10));
        System.out.println("Sum of doubles: " + mo.add(5.5, 10.5));
    }
}