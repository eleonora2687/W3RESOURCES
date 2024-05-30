// 1. Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark.

/* public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }    
}
 */


//  2. Write a Java program to create a class called Vehicle with a method called drive(). 
//  Create a subclass called Car that overrides the drive() method to print "Repairing a car".


/**
 * Inheritance
 */
/* public class Inheritance {

    public static void main(String[] args) {
        Car car = new Car();
        car.repair();

        Vehicle vehicle = new Vehicle();
        vehicle.repair();
    }
} */


// 3. Write a Java program to create a class called Shape with a method called getArea(). 
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


/**
 * Inheritance
 */
/* public class Inheritance {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(2);
        rectangle.setSideB(3);

        System.out.println(rectangle.getArea());
    }
} */



// 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


/**
 * Inheritance
 */
/* public class Inheritance {

    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(70000);

        employee.works();
        System.out.println("Employee salary: " + employee.getSalary());

        hrManager.works();
        System.out.println("Manager salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}

 */
