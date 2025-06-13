package May_24th_test_Forloop;

import java.util.Scanner;

public class Lab_117_printing_factorial_for_all_numbers {
    public static void main(String[] args) {
        int fact=1;
        System.out.println("enter any number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n==0){
            fact=1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        //System.out.println(fact);
    }
}
