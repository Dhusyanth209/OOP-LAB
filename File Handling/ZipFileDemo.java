import java.io.*;
import java.util.zip.*;

public class ZipFileDemo {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String zipFileName = "compressed.zip";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(zipFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            ZipEntry zipEntry = new ZipEntry(sourceFile);
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }

            System.out.println("File compressed successfully.");
        } catch (IOException e) {
            System.out.println("Error compressing file: " + e.getMessage());
        }
    }
}