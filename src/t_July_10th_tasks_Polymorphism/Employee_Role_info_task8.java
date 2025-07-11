package t_July_10th_tasks_Polymorphism;
//Task 3: Employee Role Info
//Title: Show employee roles with overridden methods
//Description:
//Create a class Employee with method role() printing “General Employee”.
//Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
//Call role() on each object to show how overriding helps in specialization.

public class Employee_Role_info_task8 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.role();
        manager m=new manager();
        m.role();
        Clerk c=new Clerk();
        c.role();
        tester t=new tester();
        t.role();
    }
}
class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class manager extends Employee{
    @Override
    void role(){
        System.out.println("Manager");
    }
}

class Clerk extends Employee{
    @Override
    void role(){
        System.out.println("Clerk");
    }
}

class tester extends Employee{
    @Override
    void role(){
        System.out.println("tester");
    }
}

//General Employee
//Manager
//Clerk
//tester
//
//Process finished with exit code 0