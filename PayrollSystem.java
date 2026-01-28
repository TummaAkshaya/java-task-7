// PayrollSystem.java
public class PayrollSystem {

    public static void main(String[] args) {

        // Parent reference holding child objects
        Employee emp1 = new FullTimeEmployee(101, "Akshaya", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 80, 300);

        System.out.println("===== Payroll Summary =====");

        emp1.displayDetails(); // runtime polymorphism
        emp2.displayDetails();
    }
}
