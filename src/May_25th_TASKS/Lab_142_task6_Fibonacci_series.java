package May_25th_TASKS;

import java.util.Scanner;

public class Lab_142_task6_Fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers do you want to print: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
