package n_June_20th_TASKS;
// Electricity Bill Calculation (Based on Units Consumed)
// :- take the input from the user of Units.
//Implement Rate Structure:
//Define the rate structure for calculating the bill based on the number of units consumed.
//:-  First 100 units: 0.50Rs per unit
// :-  Next 100 units (101-200): 0.75Rs per unit
//:- Next 100 units (201-300): 1.20Rs per unit
//:- Above 300 units: 1.50Rs per unit

import java.util.Scanner;

public class Electricity_Bill_Calculation_If_Else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the No.of Units");
        int Units=scanner.nextInt();

        double bill=0;

        if(Units<=100){
            bill=Units*0.50;
        }else if(Units>100 && Units<=200){
            bill=(100*0.50)+((Units-100)*0.75);
        }else if(Units>200 && Units<=300){
            bill=(100*0.50)+(100*0.75)+((Units-200)*1.20);
        }else if(Units>300){
            bill=(100*0.50)+(100*0.75)+(100*1.20)+((Units-300)*1.50);
        }
        System.out.println(bill);
    }
}
