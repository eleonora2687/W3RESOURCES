public class Programmer extends Employee{
    public int salary;
    public Programmer(int salary) {
            this.salary = salary;
    }
    int calculateSalary() {
        return salary*8*20;
    }
    void displayInfo() {
        System.out.println("The monthly salary is: " + calculateSalary());
    }
}
