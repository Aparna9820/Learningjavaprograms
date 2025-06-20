package n_June_20th_TASKS;

import java.util.Scanner;

//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//  Take the below User info and store it into the variables:
//  Age (integer)
//  Salary (double or float)
//  Credit Score (integer)
//   Age Validation:
//   :- Check if the age is a positive integer.
//   :- Ensure the age is at least 18 years old.
//   :- Max age can be 80.
//    Salary Validation:
//   :- Check if the salary is a positive number.
//   :- Define a minimum salary threshold (e.g., 30,000).
//    Credit Score Validation:
// :- Check if the credit score is a positive integer.
// :- Define a minimum credit score threshold (e.g., 650).
// :- Max credit score threshold (e.g., 850).
public class Eligible_for_Loan_If_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        System.out.println("Enter the Credit Score");
        int Credit_Score=sc.nextInt();

        if( (age>=18 && age<=80) && (salary>=30000) &&(Credit_Score>=650 && Credit_Score<=850)){
            System.out.println("Eligible for bank loan");
        } else
            System.out.println("Not Eligible for bank loan");
    }
}
