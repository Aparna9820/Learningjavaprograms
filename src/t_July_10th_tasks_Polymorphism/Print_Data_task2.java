package t_July_10th_tasks_Polymorphism;
//Task 2: Print Data
//Title: Create a universal printer with overloading
//Description:
//Create a class Printer with multiple printData() methods to handle different data types:
//printData(String data)
//printData(int data)
//printData(float data)
//Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.
public class Print_Data_task2 {
    public static void main(String[] args) {
        Print_Data_task2_class p = new Print_Data_task2_class();
        p.printData(100);
        p.printData("hello java");
        p.printData(6.7f);

    }
}

//int data--> 100
//String data---> hello java
//Float data--->  6.7
//
//Process finished with exit code 0