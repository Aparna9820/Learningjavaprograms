package n_June_24th_Tasks;

import java.util.Scanner;

public class Factorial_of_number_ForLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=scanner.nextInt();
        int fact=1;
        if(n==0)
            fact = 1;

        for (int i = 1; i <= n; i++) {
                fact *= i;
        }
        System.out.println("Factorial of the Given number is: "+ fact);
    }
}
//Enter any number:
//5
//Factorial of the Given number is: 120
//
//Process finished with exit code 0