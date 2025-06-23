package Codeing_Que_EXAM2_OOPS_Concepts;
//Multi-Exception Handling
//Implement exception handling for a program that divides two numbers and
//catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.

import java.util.Scanner;

public class Q14_Multi_Exception_Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30};

        try {
            System.out.print("Enter numerator (integer): ");
            String numStr = scanner.nextLine();

            System.out.print("Enter denominator (integer): ");
            String denomStr = scanner.nextLine();

            // Convert input strings to integers (can throw NumberFormatException)
            int numerator = Integer.parseInt(numStr);
            int denominator = Integer.parseInt(denomStr);

            // Perform division (can throw ArithmeticException)
            int result = numerator / denominator;

            System.out.print("Enter array index to access (0 to 2): ");
            int index = Integer.parseInt(scanner.nextLine());

            // Access array element (can throw ArrayIndexOutOfBoundsException)
            int value = arr[index];

            System.out.println("Result of division: " + result);
            System.out.println("Value at arr[" + index + "]: " + value);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

//Enter numerator (integer): 8
//Enter denominator (integer): 9
//Enter array index to access (0 to 2): 1
//Result of division: 0
//Value at arr[1]: 20
//Program execution completed.
//
//Process finished with exit code 0