package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class WritingFile {

    // BufferFilewriter (Fastest) -> Buffered NIO File -> NIO File -> FileWriter (Slowest)
    public static void main(String[] args) {
        //Using NIO File class ---------------------------------------------------------

        Path path=Path.of("C:/Users/ASUS/Desktop/arun.txt");
        String headerLine="----Writing using NIO File-----";
        String line1= "Hello this is arun kumar.";
        String line2= "A Java devloper! ";
        List<String> lines= List.of(headerLine,line1,line2);

        //Used to add load
        // List<String> lines = new ArrayList<>();
        // for (int i = 1; i <= 10000; i++) {
        //     lines.add("This is line " + i);
        // }
    
        long start=System.currentTimeMillis();
        try{
            Files.write(path,lines);
        }catch(IOException e){
            System.out.println("Could not write using NIO File");
        }
        long end=System.currentTimeMillis();
        System.out.println("Written using NIO File : Time taken :"+ (end-start));
    

        //Using FileWriter -------------------------------------------------------------

        String headerLine2="----Writing using FileWriter -----";
        List<String> lines1= List.of(headerLine2,line1,line2); 

        long start1=System.currentTimeMillis();
        try {

            FileWriter fileWriter =new FileWriter("C:/Users/ASUS/Desktop/arun.txt",true);
            for(String line:lines1){
                fileWriter.write(line+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end1=System.currentTimeMillis();
        System.out.println("Written using FileWriter : Time taken :"+ (end1-start1));

        //Using BufferWriter with NIO File class -------------------------------------------------

        List<String> lines2=List.of(
            "----Writing using Buffered NIO File-----",
            "Hello this is arun kumar.",
            "A Java devloper! "
        );
        long start2=System.currentTimeMillis();
        try {
            BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
            for(String line:lines2){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end2=System.currentTimeMillis();
        System.out.println("Written using Buffered File Class : Time taken :"+ (end2-start2));

        //Using BufferedWriter using FileWriter  -------------------------------------------------

        String headerLine3="---- Writing using Buffered FileWriter -----";
        List<String> lines3= List.of(headerLine3,line1,line2); 

        long start3=System.currentTimeMillis();
        try {

            BufferedWriter fileWriter =new BufferedWriter(new FileWriter("C:/Users/ASUS/Desktop/arun.txt",true));
            for(String line:lines3){
                fileWriter.write(line);
                fileWriter.newLine();
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end3=System.currentTimeMillis();
        System.out.println("Written using Buffered FileWriter : Time taken :"+ (end3-start3));


    }
}
