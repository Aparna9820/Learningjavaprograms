package n_June_20th_TASKS;

import java.util.Scanner;

//Check if a Number is a Palindrome.
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = scanner.nextInt();
        int num1 = num;
        int rev = 0;
        while (num1 > 0) {
            int r = num1 % 10;
            rev = rev * 10 + r;
            num1 = num1 / 10;

        }
        if (num == rev) {
            System.out.println("Given Number Is Plaindrome Number");
        } else
            System.out.println("Not a Palindrome Number");
    }
}

