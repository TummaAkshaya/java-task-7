// Employee.java
public class Employee {

    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to be overridden
    public double calculateSalary() {
        return 0.0;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + calculateSalary());
        System.out.println("----------------------------");
    }
}
