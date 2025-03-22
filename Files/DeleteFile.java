package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
 public static void main(String[] args) {
    
    Path path=Path.of("C:/Users/ASUS/Desktop/arun.txt");

    try {
        Files.deleteIfExists(path);
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("File deleted Successfully !");
 }   
}
