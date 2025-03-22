package Files;

import java.io.File;
import java.io.IOException;

public class OldFile {
    public static void main(String[] args) {

        //✅ Creating, deleting, and checking file properties (size, existence, permissions).
        
        String filePath="C:/Users/ASUS/Desktop/arun.txt";

        File file=new File(filePath);

         try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
