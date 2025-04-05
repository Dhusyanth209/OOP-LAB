public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // Array index out of bounds
            int result = 10 / 0; // Arithmetic exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}