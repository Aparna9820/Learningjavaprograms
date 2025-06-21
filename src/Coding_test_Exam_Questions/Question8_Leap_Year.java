package Coding_test_Exam_Questions;
//Write a program to check if a given year is a leap year.
//
//**Requirements:**
//- A year is leap if it's divisible by 4
//- Exception: if divisible by 100, it's not leap unless also divisible by 400
//- Use logical operators in conditions
public class Question8_Leap_Year {
    public static void main(String[] args) {
        int year=2024;
        if ((year%4==0 && year%100!=100)|| (year%4==0)){
            System.out.println(" Leap year ");
        }
        else
            System.out.println("Not a leap year");
    }

}
// Leap year
//
//Process finished with exit code 0
