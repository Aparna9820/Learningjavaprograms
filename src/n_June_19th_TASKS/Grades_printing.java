package n_June_19th_TASKS;

import java.util.Scanner;

public class Grades_printing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Score");
        int Score=scanner.nextInt();
        if(Score>0 && Score<=100){
            if(Score>=90){
                System.out.println("A+ Grade");
            } else if (Score>=80) {
                System.out.println("A Grade");
            }
            else if (Score>=70) {
                System.out.println("B Grade");
            }
            else if (Score>=60) {
                System.out.println("C Grade");
            } else if (Score>=50) {
                System.out.println("D Grade");
            } else if (Score>=40) {
                System.out.println("E Grade");
            } else
                System.out.println("failed");


        }else
            System.out.println("Invalid marks");
    }
}
