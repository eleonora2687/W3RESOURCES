// 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
// Test Data
// Input a degree in Fahrenheit: 212
// Expected Output:
// 212.0 degree Fahrenheit is equal to 100.0 in Celsius

/* import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter temperature in Fahrenheit: ");  
        double f= sc.nextDouble();  
        double c=(f-32)/1.8;
        System.out.println(f + " degree in Fahrenheit is equal to " + c +" in Celsius");  

    }   
}
 */



// 2. Write a Java program that reads a number in inches and converts it to meters.
// Note: One inch is 0.0254 meter.
// Test Data
// Input a value for inch: 1000
// Expected Output :
// 1000.0 inch is 25.4 meters


/* import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Give the inches: ");  
        double in= sc.nextDouble();  
        
        System.out.println(in + " inches are " + in*0.0254 + " meters\n");  

    }   
} */



// 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

/* import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int a=scanner.nextInt();
        int b=a;
        int sum=0;
        while (a!=0) {
            sum+=a%10;
            a/=10;
        }

        System.out.println("The sum of all digits in "+b+" is "+sum);
    }
    
} */


// 4. Write a Java program to convert minutes into years and days.

// Test Data
// Input the number of minutes: 3456789
// Expected Output :
// 3456789 minutes is approximately 6 years and 210 days

import java.util.Scanner;

/**
 * Data_Types
 */
/* public class Data_Types {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minutes=scanner.nextInt();
        int days=minutes/1440;
        System.out.println(minutes+" minutes is approximately "+days/365+" years and "+days34%365+ " days");
    }
} */