package ScannerTest;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); 
        scanner.nextLine(); // ❌ Leaves a newline in buffer

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();  // ❌ Skips input

        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }
}
