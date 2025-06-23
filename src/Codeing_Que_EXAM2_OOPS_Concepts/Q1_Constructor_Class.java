package Codeing_Que_EXAM2_OOPS_Concepts;
//Person Class Implementation
//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
public class Q1_Constructor_Class {
    public static void main(String[] args) {
        // Creating two instances of Person
        Person person1 = new Person("Appu", 25);
        Person person2 = new Person("Thiru", 30);

        // Printing their details
        person1.printDetails();
        person2.printDetails();
    }
}
class Person {
    String name;
    int age;

    // Constructor to initialize the person object
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print person details
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
//Name: Appu, Age: 25
//Name: Thiru, Age: 30
//
//Process finished with exit code 0