import java.io.*;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}