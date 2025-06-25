package n_June_24th_Tasks;

import java.util.Scanner;


public class Prime_number_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Given number must be greater than 0!");
        } else {
            boolean isPrime = true;
            int i = 2;

            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println("Given Number is a prime Number!");
            } else {
                System.out.println("Given Number is not a prime Number!");
            }
        }

        sc.close();
    }
}
//Enter the number:
//0
//Given number must be greater than 0!
//
//Process finished with exit code 0

//Enter the number:
//9
//Given Number is not a prime Number!
//
//Process finished with exit code 0