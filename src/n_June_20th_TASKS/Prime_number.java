package n_June_20th_TASKS;

// Check if a Number is Prime

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}

//2ND METHOD USING COUNT

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter a number: ");
//    int num = scanner.nextInt();
//    int count = 0;
//
//    for (int i = 1; i <= num; i++) {
//        if (num % i == 0) {
//            count++;
//        }
//    }
//
//    if (count == 2) {
//        System.out.println(num + " is a Prime Number.");
//    } else {
//        System.out.println(num + " is NOT a Prime Number.");
//    }
//
//    scanner.close();
//}
//}