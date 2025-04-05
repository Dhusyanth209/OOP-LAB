import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error: IO operation failed.");
        }
    }
}