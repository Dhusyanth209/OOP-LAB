import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("temp.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}