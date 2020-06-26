package vitalify.asia;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("./myfile.txt");
        BufferedInputStream bufferedInputStream = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            while (bufferedInputStream.available() > 0) {
                System.out.print((char) bufferedInputStream.read());
            }
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null) {
                    fileInputStream.close();
                    bufferedInputStream.close();
                }
            } catch (IOException exception) {
                System.out.println("Error in InputStream close(): " + exception);
                exception.printStackTrace();
            }
        }
    }
}
