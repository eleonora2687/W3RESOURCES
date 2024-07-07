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



// 9. Write a Java program to compute the specified expressions and print the output.
// Test Data:
// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
// Expected Output
// 2.138888888888889



/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
} */



// 10. Write a Java program to compute a specified formula.
// Specified Formula :
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
// Expected Output
// 2.9760461760461765



/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
} */



// 11. Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter = " + 2*Math.PI*radius);
        System.out.println("Area = " + Math.PI*radius*radius);
        
    }
} */



// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println("The average of the three numbers is: " + (x+y+z)/3.0);
    }
} */



// 13. Write a Java program to print the area and perimeter of a rectangle.

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width = ");
        double x = scanner.nextDouble();
        System.out.print("Height = ");
        double y = scanner.nextDouble();
        System.out.println("Area is " + x + " * " + y + " = " + String.format("%.2f", x*y));
        System.out.println("Perimeter is 2 * " + "(" + x + " + " + y + ")" + " = " + String.format("%.2f", 2*(x+y)));
    }
} */



// 14. Write a Java program to print an American flag on the screen.
// Expected Output

// * * * * * * ==================================
//  * * * * *  ==================================
// * * * * * * ==================================
//  * * * * *  ==================================
// * * * * * * ==================================
//  * * * * *  ==================================
// * * * * * * ==================================
//  * * * * *  ==================================
// * * * * * * ==================================
// ==============================================
// ==============================================
// ==============================================
// ==============================================
// ==============================================
// ==============================================




/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
                
            }
            
            for (int j = 0; j < 34; j++) {
                System.out.print("=");
            }
            System.out.println();

            System.out.print(" ");

            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                
            }
            System.out.print(" ");

            for (int j = 0; j < 34; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        for (int j = 0; j < 6; j++) {
            System.out.print("* ");
            
        }
        
        for (int j = 0; j < 34; j++) {
            System.out.print("=");
        }
        System.out.println();
        for(int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 46; j++) {
            System.out.print("=");
        }System.out.println();
        }
        
    }
}

 */




//  15. Write a Java program to swap two variables.

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, temp;

        x = scanner.nextInt();
        y = scanner.nextInt();

        temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x + ", y = " + y);
    }
}

 */



//  16. Write a Java program to print a face.
//  Expected Output
 
//   +"""""+
//  [| o o |]
//   |  ^  |
//   | '-' |
//   +-----+



/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        System.out.println("   +\"\"\"\"\"+");
        System.out.println("  [| o o |]");
        System.out.println("   |  ^  |");
        System.out.println("   | '-' |");
        System.out.println("   +-----+");
    }
} */




// 17. Write a Java program to add two binary numbers.
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output

// Sum of two binary numbers: 101

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        int sum = bin_to_dec(x) + bin_to_dec(y);
        System.out.println(dec_to_bin(sum));

        
    }

    static int bin_to_dec(int bin) {
        int num = bin;
        int dec = 0;
 
    
        int base = 1;
    
        int temp = num;
        while (temp != 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
    
            dec += last_digit * base;
    
            base = base * 2;
        }
    
        return dec;
        }

    static int dec_to_bin(int dec) {
        int bin = 0; 
        int cnt = 0; 
        while (dec != 0) { 
            int rem = dec % 2; 
            double c = Math.pow(10, cnt); 
            bin += rem * c; 
            dec /= 2; 
            cnt++; 

        } 
  
        return bin; 
    }
} */


// 18. Write a Java program to multiply two binary numbers.
// Input Data:
// Input the first binary number: 10
// Input the second binary number: 11
// Expected Output



/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {
        int b1 = 100;
        int b2 = 11;
        int mult;
        mult = dec_to_bin(bin_to_dec(b1) * bin_to_dec(b2));
        System.out.println(mult);
    }

    static int bin_to_dec(int bin) {
        int dec = 0;
        int base = 1;

        while (bin != 0) {
            dec += bin % 10 * base;
            bin /= 10;
            base *= 2;

        } return dec;
    }

    static int dec_to_bin(int dec) {
        int bin = 0;
        int base = 1;

        while (dec != 0) {
            bin += dec % 2 * base;
            dec /= 2;
            base *= 10;
            
        } return bin;
    }
} */


// 19. Write a Java program to convert an integer number to a binary number.
// Input Data:
// Input a Decimal Number : 5
// Expected Output

// Binary number is: 101 

// 20. Write a Java program to convert a decimal number to a hexadecimal number.
// Input Data:
// Input a decimal number: 15
// Expected Output

// Hexadecimal number is : F 



/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer");
        int dekadikos = scanner.nextInt();

        String dekaexadikos = "";

        while (dekadikos != 0) {
            int ypoloipo = dekadikos%16;
            dekadikos/=16;

            if (ypoloipo == 10) {
                dekaexadikos+="A";
            }
            else if (ypoloipo == 11) {
                dekaexadikos+="B";
            }

            else if (ypoloipo == 12) {
                dekaexadikos+="C";
            }
            else if (ypoloipo == 13) {
                dekaexadikos+="D";
            }
            else if (ypoloipo == 14) {
                dekaexadikos+="E";
            }
            else if (ypoloipo == 15) {
                dekaexadikos+="F";
            }
            else{
            dekaexadikos+=ypoloipo;}
            
        }

        String nstr="";
        char ch;
      
    
      
      for (int i=0; i<dekaexadikos.length(); i++)
      {
        ch= dekaexadikos.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println(nstr);
        

    }
}
 */


// 21. Write a Java program to convert a decimal number to an octal number.
// Input Data:
// Input a Decimal Number: 15
// Expected Output

// Octal number is: 17

/**
 * Basic
 */
/* public class Basic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int decimal = scanner.nextInt();

        int octal = 0;
        int basis =1;

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal += remainder * basis;
            basis *= 10;
            decimal /= 8;
        }
        System.out.println(octal);

    }
} */