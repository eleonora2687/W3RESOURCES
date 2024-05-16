// 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
// Expected Output :
// Hello
// Alexandra Abramov


/* public class Basic{
    public static void main(String[] args) {
        System.out.println("Hello" + "\n" + "Tikidou Eleonora");
    }

} */



// 2. Write a Java program to print the sum of two numbers.
// Test Data:
// 74 + 36
// Expected Output :
// 110


/* import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first integer: ");
            int a=scanner.nextInt();
            System.out.println("Enter fsecond integer: ");
            int b=scanner.nextInt();
            System.out.println(suma(a, b));
        }

    }

    public static int suma(int x, int y)
    {
        return x + y;
    }

} */


// 3. Write a Java program to divide two numbers and print them on the screen.

/* public class Basic {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            System.out.println(x + "/" + y + "=" + x/y);
        }
} */




// 4. Write a Java program to print the results of the following operations.


/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
} */



// 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125


/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a+" X "+b+" = "+a*b);
    }
} */




