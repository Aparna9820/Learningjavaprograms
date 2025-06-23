package Codeing_Que_EXAM2_OOPS_Concepts;
//Calculator Method Overloading
//Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.
public class Q11_Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add(int, int): " + calc.add(5, 10));               // 15
        System.out.println("Add(int, int, int): " + calc.add(1, 2, 3));        // 6
        System.out.println("Add(double, double): " + calc.add(2.5, 3.7));      // 6.2
        System.out.println("Add(int, double): " + calc.add(4, 5.5));           // 9.5
        System.out.println("Add(double, int): " + calc.add(6.5, 2));           // 8.5
    }
}
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add an int and a double
    double add(int a, double b) {
        return a + b;
    }

    // Add a double and an int
    double add(double a, int b) {
        return a + b;
    }
}

//Add(int, int): 15
//Add(int, int, int): 6
//Add(double, double): 6.2
//Add(int, double): 9.5
//Add(double, int): 8.5
//
//Process finished with exit code 0