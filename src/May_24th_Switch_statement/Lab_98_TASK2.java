package May_24th_Switch_statement;

import java.util.Scanner;

public class Lab_98_TASK2 {
    public static void main(String[] args) {
        System.out.println("enter any Grade as String");
        Scanner scanner= new Scanner(System.in);
        String grade=scanner.next();
        grade= grade.toUpperCase();    //edge case because already grades present in Capital
        switch(grade){
            case "A"-> System.out.println("Excellent");
            case "B"-> System.out.println("Very Good");
            case "C"-> System.out.println("Good");
            case "D"-> System.out.println("Needs Improvement");
            case "F"-> System.out.println("Fail");
            default -> System.out.println("Invalid Grade");
        }


    }
}
