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


import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Give the inches: ");  
        double in= sc.nextDouble();  
        
        System.out.println(in + " inches are " + in*0.0254 + " meters\n");  

    }   
}