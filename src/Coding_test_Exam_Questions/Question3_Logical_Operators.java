package Coding_test_Exam_Questions;
//Comparison and Logical Operators
//Write a program that demonstrates comparison and logical operators.
//
//**Requirements:**
//- Use comparison operators (==, !=, <, >, <=, >=)
//- Use logical operators (&&, ||, !)
//- Print boolean results with explanatory messages
public class Question3_Logical_Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Comparison operators
        System.out.println("Comparison Operators:");
        System.out.println("x == y: " + (x == y));   // false
        System.out.println("x != y: " + (x != y));   // true
        System.out.println("x < y: " + (x < y));     // true
        System.out.println("x > y: " + (x > y));     // false
        System.out.println("x <= y: " + (x <= y));   // true
        System.out.println("x >= y: " + (x >= y));   // false

        // Logical operators
        System.out.println("\nLogical Operators:");
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));   // false
        System.out.println("a || b: " + (a || b));   // true
        System.out.println("!a: " + (!a));           // false
        System.out.println("!b: " + (!b));           // true
    }
}
//Comparison Operators:
//x == y: false
//x != y: true
//x < y: true
//x > y: false
//x <= y: true
//x >= y: false
//
//Logical Operators:
//a && b: false
//a || b: true
//!a: false
//!b: true
//
//Process finished with exit code 0