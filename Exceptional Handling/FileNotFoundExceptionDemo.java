import java.io.*;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}