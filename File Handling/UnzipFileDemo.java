import java.io.*;
import java.util.zip.*;

public class UnzipFileDemo {
    public static void main(String[] args) {
        String zipFile = "compressed.zip";
        String outputDir = "./extracted/";

        File dir = new File(outputDir);
        if (!dir.exists()) dir.mkdirs();

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File outFile = new File(outputDir + entry.getName());
                try (FileOutputStream fos = new FileOutputStream(outFile)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) >= 0) {
                        fos.write(buffer, 0, length);
                    }
                }
                System.out.println("Extracted: " + entry.getName());
            }
        } catch (IOException e) {
            System.out.println("Error extracting file: " + e.getMessage());
        }
    }
}