package vitalify.asia;

import java.io.File;
import java.io.IOException;

public class Main {

    /*
    *
    *  Create a file in Java
    * */
    public static void main(String[] args) {
        try {
            File file = new File("./newfile.txt");
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
