package Coding_test_Questions;

import java.util.Scanner;

//Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1st value");
        int a=scanner.nextInt();
        System.out.println("Enter 2nd value");
        int b=scanner.nextInt();
        System.out.println("Enter 3rd value");
        int c=scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(" a is the largest number : " + a);
        } else if (b > a && b > c) {
            System.out.println(" b is the largest number : " + b);
        } else if(c>a && c>b) {
            System.out.println(" c is the largest number : " + c);
        }else {
            System.out.println("Two or more numbers are equal and largest.");
        }
    }
}
