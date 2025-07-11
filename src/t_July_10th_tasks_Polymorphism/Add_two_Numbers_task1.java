package t_July_10th_tasks_Polymorphism;
//Task 1: Add Two Numbers
//Title: Overload a method to add different types of numbers
//Description:
//Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
//The int version should add two integers.
//The double version should add two decimal numbers.
//In the main method, call both versions to demonstrate how overloading works with data types.
public class Add_two_Numbers_task1 {
    public static void main(String[] args) {
        Add_two_numbers_task1_class mo=new Add_two_numbers_task1_class();
        int r1=mo.add(4,5,6);
        System.out.println(r1);

        int r2=mo.add(5,6);
        System.out.println(r2);

        double r3=mo.add(5.88989, 8);
        System.out.println(r3);

        double r4=mo.add(6.890, 76.90000);
        System.out.println(r4);
    }
}
