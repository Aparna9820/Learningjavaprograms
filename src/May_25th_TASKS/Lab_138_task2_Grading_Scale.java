package May_25th_TASKS;

import java.util.Scanner;

public class Lab_138_task2_Grading_Scale {
    public static void main(String[] args) {
        System.out.println("enter the Score");
        Scanner scanner=new Scanner(System.in);
        int score= scanner.nextInt();
        if(score>=90 && score<=100){
            System.out.println("A garde");
        }
        else if(score>=80 && score<90){
            System.out.println("B garde");
        }
        else if(score>=70 && score<80){
            System.out.println("C garde");
        }
        else if(score>=60 && score<70){
            System.out.println("D garde");
        }

        else
            System.out.println("F garde");
    }
}
