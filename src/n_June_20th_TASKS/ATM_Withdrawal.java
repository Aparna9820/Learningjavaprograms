package n_June_20th_TASKS;

//ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
// Steps to Write the Program
// Initialize the account balance with a fixed amount (e.g., ₹10,000).
// Take user input for the amount they want to withdraw.
// Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
// Deduct the amount from the balance if conditions are met.
// Display the updated balance or an error message if the withdrawal fails

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {
        int acc_money=10000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Withdrwal amount");
        int w_Amount=scanner.nextInt();
        if(w_Amount<=0){
            System.out.println("withdrawl amount must be greater than 0");
        }else if(w_Amount%100!=0){
            System.out.println(" W_drawl amount must be multiple of 100");
        }else if(w_Amount>acc_money){
            System.out.println(" Insufficient amount");
        }else{
            acc_money=acc_money-w_Amount;
            System.out.println("collect your withdrawl amount: " +w_Amount);
            System.out.println("Account balance: " +acc_money);
        }
    }
}
//Enter the Withdrwal amount
//700
//collect your withdrawl amount: 700
//Account balance: 9300
//
//Process finished with exit code 0