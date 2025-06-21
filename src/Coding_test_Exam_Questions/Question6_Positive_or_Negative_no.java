package Coding_test_Exam_Questions;

import java.util.Scanner;

//Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//- Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
public class Question6_Positive_or_Negative_no {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num=scanner.nextInt();
        if (num>0) {
            System.out.println("Given Number is Positive Number");
        }else if(num<0) {
            System.out.println("Given Number is Negetive Number");
        }else
            System.out.println("Given number is Zero-->0");

    }
}
//Enter Any Number:
//-90
//Given Number is Negetive Number
//
//Process finished with exit code 0