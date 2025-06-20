package n_June_20th_TASKS;

import java.util.Scanner;

public class Electricity_bill_Using_Method {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take user input for units consumed
            System.out.print("Enter number of units consumed: ");
            int units = scanner.nextInt();

            double billAmount = calculateBill(units);

            System.out.println("Total Electricity Bill: ₹" + billAmount);

            scanner.close();
        }

        // Method to calculate bill based on unit slabs
        public static double calculateBill(int units) {
            double bill = 0;

            if (units <= 100) {
                bill = units * 0.50;
            } else if (units <= 200) {
                bill = (100 * 0.50) + ((units - 100) * 0.75);
            } else if (units <= 300) {
                bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
            } else {
                bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
            }

            return bill;
        }
    }

