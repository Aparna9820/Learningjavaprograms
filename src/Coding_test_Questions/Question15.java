package Coding_test_Questions;

import java.util.Scanner;

//Write a program to find and print all prime numbers between 1 and 100 using loops.
//
//**Requirements:**
//- Use nested loops to check for prime numbers
//- A prime number is divisible only by 1 and itself
//- Print all prime numbers in the range 1-100
//- Optimize the algorithm for better performance
public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int count = 0;

    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        System.out.println(num + " is a Prime Number.");
    } else {
        System.out.println(num + " is NOT a Prime Number.");
    }

    scanner.close();
}
    }

