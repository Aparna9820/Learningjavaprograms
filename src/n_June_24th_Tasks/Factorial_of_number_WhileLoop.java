package n_June_24th_Tasks;

import java.util.Scanner;

public class Factorial_of_number_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=scanner.nextInt();
        int fact=1;
        int i=1;
        if(n==0)
            fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the given number: "+fact);
    }
}
//Enter any number:
//5
//Factorial of the given number: 120
//
//Process finished with exit code 0