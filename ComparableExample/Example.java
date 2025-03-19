package ComparableExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example implements Comparable<Example>{

    int id;
    String name;
    int age;
    int sortingType;

    public Example(int id, String name, int age, int sortingType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sortingType = sortingType;
    }

    @Override
    public int compareTo(Example o) {
        switch (sortingType) {
            case 0:
                return Integer.compare(this.age, o.age);  //Age ascending
            case 1:
                return Integer.compare(o.age, this.age);  //Age descending
            case 3:
                return this.name.compareTo(o.name);  //name ascending
            case 4:
                return o.name.compareTo(this.name); //name descending
            case 5: 
                int ageSort=Integer.compare(this.age, o.age);
                return (ageSort==0)? o.name.compareTo(this.name) : ageSort;  // by age then by name ascending
        }
        return 0;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        List<Example> students = Arrays.asList(
                new Example(101, "Alice", 22, 0),
                new Example(102, "Bob", 20, 0),
                new Example(103, "Charlie", 25, 0),
                new Example(104, "David", 20, 0),
                new Example(105, "Eve", 22, 0)
        );
        
        for (int i = 0; i <= 5; i++) {
            List<Example> tempList = new ArrayList<>();
            for (Example s : students) tempList.add(new Example(s.id, s.name, s.age, i));
            Collections.sort(tempList);
            System.out.println("Sorting " + i + ":");
            printList(tempList);
        }

    }

        public static void printList(List<Example> students) {
            for (Example s : students) System.out.println(s);
            System.out.println("------------------------------------");
        

    
        }
}
