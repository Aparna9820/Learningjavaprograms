package Codeing_Que_EXAM2_OOPS_Concepts;
//Employee Hierarchy with Salary Calculation
//Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
public class Q7_Hirarchy_Inheritance {
    public static void main(String[] args) {
        employee manager = new Manager("Alice", 101, 80000, 10000);
        employee developer = new Developer("Bob", 102, 50, 160);

        manager.printDetails();
        System.out.println();
        developer.printDetails();
    }
}
// Base class
class employee {
    String name;
    int id;

    employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to calculate salary (to be overridden)
    double calculateSalary() {
        return 0.0;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass: Manager
class Manager extends employee {
    double baseSalary;
    double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Subclass: Developer
class Developer extends employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
