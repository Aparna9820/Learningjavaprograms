package May_25th_TASKS;

import javax.swing.*;
import java.util.Scanner;

public class Lab_141_task5_Leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("enter the year");
        int year=scanner.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Leap year");
        }
        else
        System.out.println("non leap year");

    }
}
