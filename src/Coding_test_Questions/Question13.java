package Coding_test_Questions;
//Write a program to print multiplication tables using nested loops.
//
//**Requirements:**
//- Print multiplication tables for numbers 1 to 5
//- Each table should show multiplications from 1 to 10
//- Use nested for loops
//- Format output clearly
public class Question13 {
    public static void main(String[] args) {
        // Outer loop for table numbers (1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table of " + i + ":");

            // Inner loop for each multiplication from 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            System.out.println(); // Print a blank line between tables
        }
    }
}
//Multiplication Table of 1:
//1 * 1 = 1
//1 * 2 = 2
//1 * 3 = 3
//1 * 4 = 4
//1 * 5 = 5
//1 * 6 = 6
//1 * 7 = 7
//1 * 8 = 8
//1 * 9 = 9
//1 * 10 = 10
//
//Multiplication Table of 2:
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//2 * 4 = 8
//2 * 5 = 10
//2 * 6 = 12
//2 * 7 = 14
//2 * 8 = 16
//2 * 9 = 18
//2 * 10 = 20
//
//Multiplication Table of 3:
//3 * 1 = 3
//3 * 2 = 6
//3 * 3 = 9
//3 * 4 = 12
//3 * 5 = 15
//3 * 6 = 18
//3 * 7 = 21
//3 * 8 = 24
//3 * 9 = 27
//3 * 10 = 30
//
//Multiplication Table of 4:
//4 * 1 = 4
//4 * 2 = 8
//4 * 3 = 12
//4 * 4 = 16
//4 * 5 = 20
//4 * 6 = 24
//4 * 7 = 28
//4 * 8 = 32
//4 * 9 = 36
//4 * 10 = 40
//
//Multiplication Table of 5:
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50
//
//
//Process finished with exit code 0