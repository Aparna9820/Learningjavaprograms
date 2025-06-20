package n_June_9th_tasks_COSTRUCTOR_Classes;

// Create a class Student with a constructor to initialize name and age. Print both using a display method.

public class Lab_214_TASK1_Student_class_constructor {
    public static void main(String[] args) {
        Lab_214_TASK1_Student_class_constructor s1= new Lab_214_TASK1_Student_class_constructor("Aparna", 25);
        s1.display();
    }
        private String name;
        int age;

     Lab_214_TASK1_Student_class_constructor(String name, int age) {
        this.name = name;
        this.age=age;      //parameterised constructor
    }

    void display(){
        System.out.println("Student name " + name);
        System.out.println("Student Age " +age);
    }
}
