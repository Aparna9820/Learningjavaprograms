package n_June_20th_TASKS;
//Calculate Bonus Based on Salary and Years of Experience.
//:- take the salary and Year info from the User.
//Implement Bonus Calculation Logic:
//Define the bonus structure based on salary and years of experience.
// :- If years of experience is less than 1 year: No bonus.
//:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//:- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//:- If years of experience is greater than 6 years: Bonus is 15% of the salary.

import java.util.Scanner;

public class Bonus_Based_on_Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        double Salary= scanner.nextDouble();

        System.out.println("Enter the no.of years Exp: ");
        int years=scanner.nextInt();
        double bonus=0;
        if(years<1){
            bonus=0.0;
        }else if(years>=1 && years<=3){
            bonus = Salary*0.05;      //5%=0.05
        }else if(years>3 && years<=6){
            bonus = Salary*0.10;    //10%=0.10
        }else if(years>6){
            bonus= Salary*0.15;
        }
        System.out.println("Bonus is: " +bonus);

    }
}
