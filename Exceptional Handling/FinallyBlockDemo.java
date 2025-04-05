public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // Exception occurs
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}