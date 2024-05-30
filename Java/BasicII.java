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




//  154. Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

//  Sample array:
//  array = {{true, false, true},
//  {false, true, false}};
//  Expected Output :
//  t f t
//  f t f


/**
 * BasicII
 */
/* public class BasicII {

    public static void main(String[] args) {
        boolean[][] array={{true, false, true},{false, true, false}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==true) {
                    System.out.print("t ");
                } else {
                    System.out.print("f ");
                }
            }
            System.out.println();
        }
    }
      
} */


// 155. Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

// Original Array:
// 10 20 30
// 40 50 60
// After changing the rows and columns of the said array:10 40
// 20 50
// 30 60


/**
 * BasicII
 */
/* public class BasicII {

    public static void main(String[] args) {
        int[][] array1={{10, 20, 30}, {40, 50, 60}};
        int[][] array2 = new int[array1[0].length][array1.length];
        int j;
        for (int i = 0; i < array1[0].length; i++) {

            for (j = 0; j < array1.length; j++) {
                array2[i][j]=array1[j][i];
            }
            
        }

        for (int i = 0; i < array2.length; i++) {
            for (j = 0; j < array2[0].length-1; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(array2[i][j]);
        }
    }
}
 */


// 156. Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.

// Original Number: 2350
// Result: 115

/**
 * BasicII
 */
/* public class BasicII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int log2 = 1;

        int counter = 0;
        while (log2 <= num) {
            log2*=2;
            counter+=1;
        }
        if (log2 == num) {
            System.out.println(counter);
        } else {
            System.out.println(counter - 1);
        }
    }
} */