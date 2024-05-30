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



// 3. Write a Java recursive method to calculate the nth Fibonacci number.

/**
 * Recursive_Methods
 */
/* public class Recursive_Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(Fibonacci(a));
    }

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }return Fibonacci(n-1) + Fibonacci(n-2);
    }
}

 */


//  4. Write a Java recursive method to check if a given string is a palindrome.

/**
 * Recursive_Methods
 */
/* public class Recursive_Methods {

    public static void main(String[] args) {
        String s1="malayalam";
        String s2="geeks";
        System.out.println(isPalindrome(s1, 0));
        System.out.println(isPalindrome(s2, 0));
    }

    public static boolean isPalindrome(String s, int i)
    {
        if (s.length()%2==0 && i>(s.length()-1)/2) {
            return true;
        }
        else if(s.length()%2==1 && i==(s.length()-1)/2) {
            return true;
        }
        else if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
            return false;
        }return isPalindrome(s, i+1);

    }
}
 */