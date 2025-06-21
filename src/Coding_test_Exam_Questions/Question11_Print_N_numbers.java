package Coding_test_Exam_Questions;

import java.util.Scanner;

//Write a program to print numbers from 1 to N using a for loop.
//
//**Requirements:**
//- Read the value of N from user input
//- Use for loop to print numbers from 1 to N
//- Print numbers in a single line separated by spaces
public class Question11_Print_N_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N from user
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        // Print numbers from 1 to N using a for loop
        System.out.println("Numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
//Enter a number (N): 8
//Numbers from 1 to 8:
//1 2 3 4 5 6 7 8
//Process finished with exit code 0