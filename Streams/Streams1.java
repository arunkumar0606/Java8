import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Sample{

public static void main(String[] args) {

    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // 1) Given a list of integers, filter out the even numbers and return their squares in a new list.
    //Expetced [4, 16, 36, 64, 100]
   
    numbers= numbers.stream()
                    .filter(x->x%2==0)
                    .map(x->x*x)
                    .collect(Collectors.toList());

    System.out.println("1) "+numbers);

    // 2) Given a list of numbers, find the second-highest number using Streams.
    //Expected 64

    Optional<Integer> secondHighest = numbers.stream()
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip the first (highest) element
                .findFirst(); 

    System.out.println("2) "+secondHighest.get());


    // 3) Given a list of strings, convert all elements to uppercase using Streams.
    List<String> names = List.of("apple", "banana", "cherry");
    names=names.stream()
               .map(x->x.toUpperCase())
               .collect(Collectors.toList());
    System.out.println("3) "+names);

    // 4) Given a list of integers, find duplicate elements.
    numbers = List.of(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1);
    HashSet<Integer> set=new HashSet<>();
    Set<Integer> ans= numbers.stream()
                             .filter(n->!set.add(n))
                             .collect(Collectors.toSet());
    System.out.println("4) "+ans);


    // 5)  Find the Third-Highest Number in a List
    List<Integer> num5=List.of(3,1,5,8,9);
    Optional<Integer> ans5=num5.stream()
                               .sorted(Comparator.reverseOrder())
                               .skip(2)
                               .limit(1)
                               .findFirst();
    System.out.println("5) "+ans5.get());

    // 6) Find the Most Frequent Character in a String
    String s6="abbccddddde";
    Optional<Map.Entry<Character, Long>> mostFrequentChar=s6
                  .chars()
                  .mapToObj(c->(char)c)
                  .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                  .entrySet().stream()
                  .max(Map.Entry.comparingByValue());
    System.out.println("6) "+mostFrequentChar.get().getKey());

    //7) Convert a List of Strings to a Map of String Lengths
    List<String> arr7=List.of("Arunkumar","dhoni","rainasixer");
    Map<Integer,List<String>> map7=arr7.stream()
                                       .collect(Collectors.groupingBy(String::length));

                                       //(OR)

    Map<String, Integer> wordLengths = arr7.stream()
                                           .collect(Collectors.toMap(word -> word, String::length));
    System.out.println("7) "+map7);

    //8) Merge Two Lists into a Single List Without Duplicates
    List<Integer> arr81=List.of(8,7,7,5,1);
    List<Integer> arr82=List.of(2,3,4,5,6);
    List<Integer> mergedList = Stream.concat(arr81.stream(), arr82.stream())
                                     .distinct()
                                     .collect(Collectors.toList());
    System.out.println("8) "+mergedList);

    //9) Find the First Non-Repeating Character in a String
    // String s9="arunarn";
    // Optional<Character> ans9=s9.chars().filter(x->)

    //10) Partition a List of Integers into Even and Odd Numbers
    List<Integer> arr10=List.of(2,1,6,7,8,9,10);
    Map<String,List<Integer>> ans10=arr10.stream().collect(Collectors.groupingBy(x->x%2==0 ?"Even":"Odd"));
    System.out.println(ans10);

    //11) Group Employees by Age Bracket (20-30, 30-40, etc.)
    List<Integer> arr11=List.of(23,25,24,39,32,60);
    Map<String,List<Integer>> ans11=


    //12) Find the Longest Word That Starts with a Given Letter
    // char c='a';
    // List<String> arr12=List.of("arun","arunkumar","arnold","ak");
    // String asn12 = arr12.stream().collect(Collectors.groupingBy(x->x.startsWith(c),Collectors.groupingByString::length));

    //13) Find Pairs of Numbers That Sum to a Target Value
    int target=35;

    //14) Reverse the Words in a Sentence Using Streams

    






}
}