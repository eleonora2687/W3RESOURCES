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




// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int add = a + b;
        int mult = a*b;
        int sub = a - b;
        int div = a/b;
        int rem = a%b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + rem);
    }
} */



// 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }    
} */