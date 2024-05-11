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

