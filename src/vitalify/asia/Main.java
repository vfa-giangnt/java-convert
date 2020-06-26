package vitalify.asia;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("./myfile.txt");
        createNewFile(file);

        try {
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }

    private static void createNewFile(File file) {
        try {
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            } else {
                System.out
                        .println("File already present at the specific location");
            }
        } catch (IOException exception) {
            System.out.println("Exception Occurred");
            exception.printStackTrace();
        }
    }
}
