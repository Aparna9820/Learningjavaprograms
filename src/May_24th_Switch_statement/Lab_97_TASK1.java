package May_24th_Switch_statement;

import java.util.Scanner;

public class Lab_97_TASK1 {
    public static void main(String[] args) {
        System.out.println("enter the month number");
        Scanner scanner= new Scanner(System.in);
        int month=scanner.nextInt();

        System.out.println("enter the year");
        int year=scanner.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12-> System.out.println("31 days");
            case 4,6,9,11-> System.out.println("30 days");
            case 2->{
                if(year%4==0 && year%100!=0)
                    System.out.println("29 days as leap year");
                else
                    System.out.println("28 Days");
            }
            default -> System.out.println("enter invalid data");
        }

    }
}
