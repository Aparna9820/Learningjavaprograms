package t_July_10th_tasks_Polymorphism;
// Task 4: Greet User
//Title: Greet users differently using overloading
//Description:
//Create a class Greeter with the following methods:
//greet() – prints "Hello!"
//greet(String name) – prints "Hello, [name]!"
//This task teaches overloading based on the number of parameters.

public class Greet_User_task4 {
    public void greet() {
        System.out.println("hello!");
    }

    public void greet(String name) {
        System.out.println("hello " + name + "!");
    }

    public static void main(String[] args) {
        Greet_User_task4 G= new Greet_User_task4();
        G.greet();
        G.greet("Appu");

    }
}
//hello!
//hello Appu!
//
//Process finished with exit code 0