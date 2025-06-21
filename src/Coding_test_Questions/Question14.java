package Coding_test_Questions;

import java.util.Scanner;

//Create a program to print various star patterns using nested loops.
//
//**Requirements:**
//- Print a right triangle pattern of stars
//- Print a pyramid pattern of stars
//- Use nested loops for pattern generation
//- Make patterns scalable based on input size
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Right triangle pattern
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pyramid pattern
        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // 2 spaces for better alignment
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//Enter the number of rows: 5
//
//Right Triangle Pattern:
//*
//* *
//* * *
//* * * *
//* * * * *
//
//Pyramid Pattern:
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//
//Process finished with exit code 0