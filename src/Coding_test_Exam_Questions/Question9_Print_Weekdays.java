package Coding_test_Exam_Questions;

import java.util.Scanner;

//Day of the Week (Switch Statement)
//Create a program using switch statement to display the day of the week.
//
//**Requirements:**
//- Read a number (1-7) representing day of week
//- Use switch statement to print corresponding day name
//- Handle invalid input with default case
public class Question9_Print_Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()) {


            int day = scanner.nextInt();
            switch (day) {

                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only");


            }

        } else {
            System.out.println("You entered invalid data");
        }

    }

}
//Enter the day to 1 to 7
//yu
//You entered invalid data
//
//Process finished with exit code 0
