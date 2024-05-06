// 1. Write a Java recursive method to calculate the factorial of a given positive integer.

import java.util.Scanner;

public class Recursive_Methods {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n=scanner.nextInt();
            
            System.out.println(factorial(n));
        }
    }
    static int factorial(int num)
    {
        if (num == 0 || num == 1) {
            return 1;
        }return num * factorial(num-1);
    }
}
