package May_24th_test_Forloop;

import java.util.Scanner;

public class Lab_118_factorial_for_particular_number {
    public static void main(String[] args) {
        System.out.println("enter any number!");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int fact=1;
        if(n==0){
            fact=1;
        }
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
