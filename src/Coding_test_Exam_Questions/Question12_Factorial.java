package Coding_test_Exam_Questions;

import java.util.Scanner;

//Create a program to calculate factorial of a number using while loop.
//
//**Requirements:**
//- Read a positive integer from user input
//- Use while loop to calculate factorial
//- Handle edge case for 0! = 1
//- Use appropriate data type to handle large results
public class Question12_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a positive integer from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;  // Use long for large results
            int i = number;

            // Use while loop to calculate factorial
            while (i > 1) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
//Enter a positive integer: 5
//Factorial of 5 is: 120
//
//Process finished with exit code 0