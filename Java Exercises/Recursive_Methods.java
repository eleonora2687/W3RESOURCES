// 1. Write a Java recursive method to calculate the factorial of a given positive integer.

/* import java.util.Scanner;

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
 */



//  2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.

/* import java.util.Scanner;

public class Recursive_Methods {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n=scanner.nextInt();
            
            System.out.println(sum(n, 0));
        }
    }
    public static int sum(int num, int s)
    {
        if (num == 0) {
            return s;
        }return sum(num-1, s + num);
    }
} */



