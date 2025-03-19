package Vaargs;

public class Sample {
   public static int add(int...numbers){
    int total=0;
    for (int num : numbers) {
        total += num;
    }
       return total;

   }
   public static void main(String[] args) {
    System.out.println(add(1,2,3));
    System.out.println(add(5,4,6));
   }
}
