package n_June_20th_TASKS;
//Find if a Person Can Travel Based on Visa Status and Age.
//take the input from the user for
//Age (integer).
//Visa Status (String or boolean).
//Check Eligibility:
// :- If age is 18 or older and visa status is valid, the person can travel.
//Otherwise, the person cannot travel.
//Validation Criteria
//Age: - Must be a non-negative integer.
//:- Should be greater than or equal to 18 to be eligible to travel.
// Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
//:- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.

import java.util.Scanner;

public class Person_Travel_with_VISA_AGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        System.out.println("Enter Visa Status");
        boolean Visa = scanner.nextBoolean();

        if (age > 18 && Visa == true) {
            System.out.println("Person Eligible to Travel");
        } else {
            System.out.println("not eligible to travel");
        }
    }
}
