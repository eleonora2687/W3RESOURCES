// 151. Write a Java program to find the value of a specified expression.
// a) (101 + 0) / 3
// b) 3.0e-6 * 10000000.1
// c) true && true
// d) false && true
// e) (false && false) || (true && true)
// f) (false || false) && (true && true)

// Expected Output :
// (101 + 0) / 3-> 33
// (3.0e-6 * 10000000.1)-> 30.0000003
// (true && true)-> true
// (false && true)-> false
// ((false && false) || (true && true))-> true
// (false || false) && (true && true)-> false


/* public class BasicII {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println((101 + 0) / 3);
        System.out.println(3.0e-6 * 10000000.1);
        System.out.println(true && true);
        System.out.println((false && false) || (true && true));
        System.out.println(false && true);
        System.out.println((false || false) && (true && true));
    }
}
 */




//  152. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

//  Sample Output:
//  Input first number: 25
//  Input second number: 37
//  Input third number: 45
//  Input fourth number: 23
//  Numbers are not equal!

/* import java.util.Scanner;

public class BasicII {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a= scanner.nextInt();
        
        System.out.println("Enter second integer: ");
        int b= scanner.nextInt();

        System.out.println("Enter third integer: ");
        int c= scanner.nextInt();

        System.out.println("Enter fourth integer: ");
        int d= scanner.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("Numbers are equal!\n");
        }
        else{
            System.out.println("Numbers are not equal!\n");

        }

    }
}

 */


// 153. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

/* import java.util.Scanner;

public class BasicII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (Between(x, y)) {
            System.out.println("The two numbers are within preferred range");
        } else {
            System.out.println("The two numbers are not within preferred range");
            
        }
    }
    public static boolean Between(double a, double b) {
        if (a>1 && a<5 && b>1 && b<5) {
            return true;
        }return false;
    }
}
 */