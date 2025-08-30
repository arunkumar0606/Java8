package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {
     public static void main(String[] args) {
        String filename = "student.ser";

        // Create an object
        Student s1 = new Student(101, "Arun","TCS");

        // ✅ Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(s1);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //✅ Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) in.readObject();
            System.out.println("Deserialized Object:");
            System.out.println("ID: " + s2.id + " , Name: " + s2.name+ " , Job : "+s2.job);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
