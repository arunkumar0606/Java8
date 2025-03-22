package Files;
import java.io.*;
import java.nio.file.*;

public class ReadingFile {

    //Buffered NIO Files (fastest) ->  Buffered FileReader -> FileReader -> NIO Files

    public static void main(String[] args) {

        Path path = Path.of("C:/Users/ASUS/Desktop/arun.txt");

        //Using NIO Files.readString() ------------------------------------------------
        long start = System.currentTimeMillis();

        System.out.println("-------Reading using NIO Files--------");
        try {
            String content = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Could not read using Files.readString()");
        }
        long end = System.currentTimeMillis();
        System.out.println("Read using NIO Files : Time taken : " + (end - start) + " ms");

        //Using FileReader (Character by Character)-------------------------------------
        start = System.currentTimeMillis();
        System.out.println("-------Reading using FileReader-------");
        try (FileReader fr = new FileReader("C:/Users/ASUS/Desktop/arun.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                //System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.currentTimeMillis();
        System.out.println("Read using FileReader : Time taken : " + (end - start) + " ms");

        // Using BufferedReader with NIO Files.newBufferedReader()----------------------------------
        start = System.currentTimeMillis();
        System.out.println("-------Reading using BufferedReader ------");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
           
            while ((line = br.readLine()) != null) {
              //  System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.currentTimeMillis();
        System.out.println("Read using Buffered NIO Files : Time taken : " + (end - start) + " ms");


        //  Using BufferedReader with FileReader--------------------------------------------------------
        start = System.currentTimeMillis();
        System.out.println("-------Reading using Buffered FileReader------");
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/ASUS/Desktop/arun.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.currentTimeMillis();
        System.out.println("Read using Buffered FileReader : Time taken : " + (end - start) + " ms");
    }
}


