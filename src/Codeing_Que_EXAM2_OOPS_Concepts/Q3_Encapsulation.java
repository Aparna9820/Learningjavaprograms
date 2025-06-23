package Codeing_Que_EXAM2_OOPS_Concepts;
//Employee Encapsulation
//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
public class Q3_Encapsulation {
    public static void main(String[] args) {
        Employee E1= new Employee(201, "Appu", 15000);
        E1.getId();
        E1.getName();
        E1.getSalary();
        System.out.println("Employee Id: " + E1.getId());
        System.out.println("Employee Name: " + E1.getName());
        System.out.println("Employee salaray: " + E1.getSalary());
        E1.setId(222);
        System.out.println("Updated Id :" +E1.getId());
        E1.setName("Thiru");
        System.out.println("Updated Name: " +E1.getName());


    }

}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

//Employee Id: 201
//Employee Name: Appu
//Employee salaray: 15000.0
//Updated Id :222
//Updated Name: Thiru
//
//Process finished with exit code 0