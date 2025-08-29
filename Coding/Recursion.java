import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n<1){
            return;
        }
        
        print(n-1);
        System.out.println(n);
    }
}
