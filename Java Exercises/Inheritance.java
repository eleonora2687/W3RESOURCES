// 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

public class Inheritance {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.makeSound();
    }
}

class Animal {

    public void makeSound() {
        System.out.println("Woof woof");
    }
}

/**
 * InnerInheritance
 */
class Cat extends Animal {
    
    
}


