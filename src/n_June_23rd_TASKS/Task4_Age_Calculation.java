package n_June_23rd_TASKS;

import java.util.Scanner;

public class Task4_Age_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take age input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Edge case: Negative age
        if (age <=0) {
            System.out.println("Invalid input: Age cannot be negativeor 0");
        }
        // Categorize based on age
        else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age <= 64) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }

        scanner.close();
    }
}
