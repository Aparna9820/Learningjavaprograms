package n_June_17th_Tasks_If_else;

import java.util.Scanner;

//Check if a Number is Even or Odd.

////public class Task2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any Number");
//        int n = scanner.nextInt();
//        if (n == 0) {
//            System.out.println("Given number is 0");
//        } else if (n % 2 == 0) {
//            System.out.println("Given number is EVEN");
//        } else {
//            System.out.println("Given number is ODD");
//        }
//
//        scanner.close();
//
//        }
//    }


//EDGE CASE program when i am giving the Value as Negative

public class Task2_EVEN_or_Odd_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Given number is 0");
        } else {
            if (n > 0) {
                System.out.print("Given number is Positive and ");
            } else {
                System.out.print("Given number is Negative and ");
            }

            if (n % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }

        scanner.close();
    }
}