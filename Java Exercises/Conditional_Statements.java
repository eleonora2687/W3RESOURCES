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