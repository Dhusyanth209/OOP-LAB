public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // Null reference access
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        }
    }
}