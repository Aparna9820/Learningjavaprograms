package May_18th_if_class;

import java.util.Scanner;

public class Lab_81_if_else_using_Scanner_Class {
    public static void main(String[] args) {
        System.out.println("Enter your Age");
        Scanner scanner= new Scanner(System.in);
        int age=scanner.nextInt();
        if (age>18)
            System.out.println("allowed to vote");
        else
            System.out.println("Not allowed to vote!");

    }
}
