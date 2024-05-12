// 1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

/* public class Threads {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
    }
} */


// 2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

public class Threads {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
        Thread2 thread2=new Thread2();
        thread2.start();
    }
}