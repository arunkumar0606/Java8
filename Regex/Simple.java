package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple {
 public static void main(String[] args) {
    String sentence="The colors used are #FF5733 #GF5043 .My birthdate is 1995-12-05 and my brother's is 05/07/2000. https://www.fb.in Visit https://www.google.com";

    //HexCode
    Matcher matcher=Pattern.compile("#[A-Z0-9]+{6}").matcher(sentence);
    while(matcher.find()){
        System.out.println("Found Code : "+matcher.group());
    }

    //BirthDate
    Matcher matcher1=Pattern.compile("\\d{2,4}[-/]\\d{2}[-/]\\d{2,4}").matcher(sentence);
    while(matcher1.find()){
        System.out.println("Found BirthDate : "+matcher1.group());
    }

    //Website
    Matcher matcher2=Pattern.compile("https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}").matcher(sentence);
    while(matcher2.find()){
        System.out.println("Found WebSite : "+matcher2.group());
    }

 }   
}
