// 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). 
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

/* public class Abstract_Classes {
    public static void main(String[] args) {
        Animal lion = new Lion(); 
        Animal tiger = new Tiger();
        lion.sound();;
        tiger.sound(); 
    }
    
} */


// 2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
// Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter 
// of each shape.



/* public class Abstract_Classes {
    public static void main(String[] args) {
        Circle circle=new Circle(1.5);
        Triangle triangle=new Triangle(2,3,4);
        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculateArea());

    }
    
} */


// 3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods 
// to handle deposits and withdrawals for each account type.


/* public class Abstract_Classes {
    
    public static void main(String[] args) {
        int ibal,damt,wamt;
        ibal = 1000;
        SavingsAccount savingsAccount = new SavingsAccount(ibal);
		System.out.println("Savings A/c: Initial Balance: $"+ibal);
		damt = 500;
        savingsAccount.deposit(damt);
		wamt = 250;
        savingsAccount.withdraw(wamt);
		wamt = 1600;
		System.out.println("\nTry to withdraw: "+wamt+"$");
        savingsAccount.withdraw(wamt);


        System.out.println();
        ibal = 5000;
        CurrentAccount currentAccount = new CurrentAccount(ibal);
		System.out.println("Current A/c: Initial Balance: "+ibal+"$");
		damt = 2500;
        currentAccount.deposit(1000);
		wamt = 1250;
        currentAccount.withdraw(3000);
		wamt = 6000;
		System.out.println("\nTry to withdraw: "+wamt+"$");
        savingsAccount.withdraw(wamt);	

        System.out.println(savingsAccount.getBalance());
        System.out.println(currentAccount.getBalance());

        BankAccount bankAccount=new BankAccount(100) {

            @Override
            void deposit(int amount) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'deposit'");
            }

            @Override
            void withdraw(int amount) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
            }
            
        };
        System.out.println(bankAccount.getBalance());

    }
    
} */




// 5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary 
// and display information for each role.


/**
 * Abstract_Classes
 */
/* public class Abstract_Classes {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(4);
        
        System.out.println(programmer.calculateSalary());
    }
}
 */
