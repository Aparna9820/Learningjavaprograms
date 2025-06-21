package Coding_test_Questions;

import java.util.Scanner;

//Write a program to create a simple calculator using switch statement.
//
//**Requirements:**
//- Read two numbers and an operator (+, -, *, /)
//- Use switch statement to perform the operation
//- Handle division by zero
//- Display the result
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Read the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation using switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        scanner.close();
    }
}
//Enter first number: 7
//Enter second number: 8
//Enter an operator (+, -, *, /): *
//Result: 56.0
//
//Process finished with exit code 0