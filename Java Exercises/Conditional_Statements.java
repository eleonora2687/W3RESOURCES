// 1. Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data
// Input number: 35
// Expected Output :
// Number is positive

/* import java.util.Scanner;

public class Conditional_Statements {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter a number: 12");
                int num=scanner.nextInt();
                
                if(num>0)
                {
                    System.out.println("Number is positive");
                }    
                else{
                    System.out.println("Number is negtive");
                }
            }
            }
} */



// 2. Write a Java program to solve quadratic equations (use if, else if and else).

// Test Data
// Input a: 1
// Input b: 5
// Input c: 1
// Expected Output :
// The roots are -0.20871215252208009 and -4.7912878474779195

/* import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");

        int a=scanner.nextInt();
        
        System.out.println("Enter b: ");

        int b=scanner.nextInt();

        System.out.println("Enter c: ");

        int c=scanner.nextInt();

        double d = Math.pow(b, 2) - 4*a*c;

        if (d > 0) {
            System.out.println("The roots are "+ (-b + Math.sqrt(d))/2*a + " and " + (-b - Math.sqrt(d))/2*a + "\n");
        } else if (d == 0)
        {
            System.out.println("The root is "+ -b/2*a + "\n");
        }
        else{
            System.out.println("The equation has no roots \n");
        }

    }
} */



// 3. Write a Java program that takes three numbers from the user and prints the greatest number.

/* import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y=scanner.nextInt();
        if (x>=y) {
            int z=scanner.nextInt();
            if (x>=z) {
                System.out.println(x);
            } else {
                System.out.println(z);
                
            }
        } else {
            int z=scanner.nextInt();
            if (y>=z) {
                System.out.println(y);
            } else {
                System.out.println(z);
                
            }
        }
    }
    
}
 */



// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
//  Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

import java.util.Scanner;

/**
 * Conditional_Statements
 */
/* public class Conditional_Statements {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    float x=scanner.nextFloat();
    
    if (Math.signum(x) == 0) {
        System.out.println("zero");
    } 
    else if(x > 0) {
        System.out.println("positive");
    }
    else {
        System.out.println("negative");
    }

    if (Math.abs(x) < 1) {
        System.out.println("small");
    } 
    else if(Math.abs(x) > 1000000) {
        System.out.println("large");
    }
  }
}
 */