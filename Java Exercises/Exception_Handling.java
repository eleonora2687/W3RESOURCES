// 1. Write a Java program that throws an exception and catch it using a try-catch block.

/* public class Exception_Handling {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int divident, int divisor){
        if (divisor==0) {
            throw new ArithmeticException("Division by zero is prohibited");
        }return divident/divisor;
    }
    
}
 */




//  2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.Scanner;

/**
 * Exception_Handling
 */
public class Exception_Handling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        try {
            is_Odd(a);
            System.out.println("The number is even");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public static void is_Odd(int n) throws Exception {
        if (n % 2 == 1) {
            throw new Exception("The number you've entered is odd");
        }
    }
}