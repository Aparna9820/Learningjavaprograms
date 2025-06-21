package Coding_test_Questions;
//Operator Precedence and Type Casting
//Write a program that demonstrates operator precedence and type casting in Java.
//
//**Requirements:**
//- Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations
public class Question5 {
    public static void main(String[] args) {
        // Operator precedence example
        int r1= 10+2*5;
        System.out.println("result "+ r1 + "-->  (multiplication 1st then Addition performed)");

        int r2=(10+2)*5;
        System.out.println("result "+ r2 + " --> Addition 1st because of braces then Multiplication performed");
        System.out.println();

        // Type casting examples
        // Implicit casting (widening) - int to double
        int int_val=100;
        double double_val=int_val;
        System.out.println("before implicit value: " +int_val );
        System.out.println("Implicit casting value: "+ double_val);
        System.out.println();

        // Explicit casting (narrowing) - double to int
        double price = 99.99;
        int intPrice = (int) price;
        System.out.println("before explicit value: " +price );
        System.out.println("Explicit casting value: " +intPrice);

    }
}
//result 20-->  (multiplication 1st then Addition performed)
//result 60 --> Addition 1st because of braces then Multiplication performed
//
//befor implicit value: 100
//Implicit casting value: 100.0
//
//befor explicit value: 99.99
//Explicit casting value: 99
//
//Process finished with exit code 0
