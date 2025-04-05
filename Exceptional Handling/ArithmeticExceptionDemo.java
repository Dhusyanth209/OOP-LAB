public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 2; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}