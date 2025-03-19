package Comparater;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + ", Age: " + age+"]";
    }

    public static void main(String[] args) {

         List<Student> students = Arrays.asList(
                new Student(101, "Alice", 22),
                new Student(102, "Bob", 20),
                new Student(103, "Charlie", 25),
                new Student(104, "David", 20),
                new Student(105, "Eve", 22)
        );

        // sort by age 
        students.sort(Comparator.comparing(Student::getAge));
        students.forEach(System.out::println);
        System.out.println("--------------------------------");

        //sort by age reversed 
        students.sort(Comparator.comparing(Student::getAge).reversed());
        students.forEach(System.out::println);
        System.out.println("--------------------------------");

         //sort by name  
         students.sort(Comparator.comparing(Student::getName));
         students.forEach(System.out::println);
         System.out.println("--------------------------------");

         //sort by name reversed
         students.sort(Comparator.comparing(Student::getName,Comparator.reverseOrder()));
         students.forEach(System.out::println);
         System.out.println("--------------------------------");

         //sort by age then by name reversed  
         students.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getName,Comparator.reverseOrder()));
         students.forEach(System.out::println);
         System.out.println("--------------------------------");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
