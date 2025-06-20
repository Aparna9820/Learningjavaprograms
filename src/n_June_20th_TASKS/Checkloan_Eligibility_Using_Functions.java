package n_June_20th_TASKS;

import java.util.Scanner;

public class Checkloan_Eligibility_Using_Functions {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input values
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter Credit Score: ");
            int creditScore = scanner.nextInt();

            // Validation and Eligibility Check
            if (!isValidAge(age)) {
                System.out.println("Invalid age. Age must be between 18 and 80.");
            } else if (!isValidSalary(salary)) {
                System.out.println("Invalid salary. Salary must be at least 30,000.");
            } else if (!isValidCreditScore(creditScore)) {
                System.out.println("Invalid credit score. Score must be between 650 and 850.");
            } else {
                System.out.println("The person is eligible for the loan.");
            }

            scanner.close();
        }

        // Age validation
        public static boolean isValidAge(int age) {
            return age > 0 && age >= 18 && age <= 80;
        }

        // Salary validation
        public static boolean isValidSalary(double salary) {
            return salary > 0 && salary >= 30000;
        }

        // Credit score validation
        public static boolean isValidCreditScore(int creditScore) {
            return creditScore > 0 && creditScore >= 650 && creditScore <= 850;
        }
    }
