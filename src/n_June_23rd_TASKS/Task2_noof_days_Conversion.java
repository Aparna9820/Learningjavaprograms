package n_June_23rd_TASKS;

import java.util.Scanner;

//23) Convert Days into Years, Months, and Days.
//:- Take the Days Input from the User
//Define the conversion logic:
//:- Assume 1 year = 365 days.
//:- Assume 1 month = 30 days
//:- Convert the Days into Years, Month and days and Print it.
//if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
public class Task2_noof_days_Conversion {
    public static void main(String[] args) {
        int year=0;
        int month=0;
        int day=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number of days: ");
        int days =scanner.nextInt();

        if(days<0){
            System.out.println("Invalida data because days are not in negative number");
        }else if(days==0){
            System.out.println(year + " years "+ month +" months "+ day + " days ");
        }else if(days<365){
            month = days/30;
            day=days%30;
            System.out.println("Result: " + year+ " years "+ month + " months "+ day + " days ");
        }else{
            year = days/365;
            int r_days= days%365;

            month= r_days/30;
            day=r_days%30;
        }
        System.out.println("Result: " + year+ " years "+ month + " months "+ day + " days ");
        scanner.close();
    }
}
//Enter the Number of days:
//365
//Result: 1 years 0 months 0 days

//Process finished with exit code 0

//Enter the Number of days:
//1000
//Result: 2 years 9 months 0 days

//Process finished with exit code 0

//Enter the Number of days:
//0
//0 years 0 months 0 days
//Result: 0 years 0 months 0 days

//Process finished with exit code 0