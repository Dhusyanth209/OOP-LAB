import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.newLine();
            writer.write("New log entry: Java file handling.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}