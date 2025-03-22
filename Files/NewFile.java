package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NewFile {
    public static void main(String[] args) {

        Path path=Path.of("C:/Users/ASUS/Desktop/arun.txt");

        String line1= "Hello this is arun kumar.";
        String line2= "A Java devloper! ";
        List<String> lines= List.of(line1,line2);

        try{
            Files.write(path,lines);
        }
        catch(IOException ex){
            System.out.println("Couldn't write them..");
        }
        System.out.println("Written succesfully");

    }
}
