package May_24th_test_Forloop;

import java.util.Scanner;

public class Lab_119_factorial_code_from_class {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) {
            fact = 1;
        }

        if (n > Integer.MAX_VALUE) { // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int");
        }


        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);


    }
}

