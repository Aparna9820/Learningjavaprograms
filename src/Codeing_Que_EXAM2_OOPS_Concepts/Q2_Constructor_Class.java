package Codeing_Que_EXAM2_OOPS_Concepts;
//Student Management System
//Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.

public class Q2_Constructor_Class {
    public static void main(String[] args) {
        Student s1 = new Student("Aparna", 24, "A");
        Student s2 = new Student("Thiru", 25, "B");
        s1.printDetails();
        s2.printDetails();
    }
}
class Student{
    String name;
    int Rollno;
    String Section;

    public Student(String name, int rollno, String section) {
        this.name = name;
        Rollno = rollno;
        Section = section;
    }
    void printDetails() {
        System.out.println("Name: " + name + ", Roll No: " + Rollno + ", Section: " + Section);
    }
}
//Name: Aparna, Roll No: 24, Section: A
//Name: Thiru, Roll No: 25, Section: B
//
//Process finished with exit code 0
