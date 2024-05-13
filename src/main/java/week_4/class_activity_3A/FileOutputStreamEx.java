package week_4.class_activity_3A;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileOutputStream out = new FileOutputStream(desktopPath + "/output1.csv");

            String wr = "I am still learning how to write to a file";

            byte[] bytes = wr.getBytes();

            out.write(bytes);

            out.close();

            System.out.println("Successfully written to a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
