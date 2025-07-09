package t_july_5th_coding_tasks;
//Try-Catch-Finally Example
//Write a program that demonstrates try-catch-finally block with division operation.
class DivisionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result = 0;

        try {
            // This will throw ArithmeticException if denominator is 0
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
//Caught exception: Division by zero is not allowed.
//Finally block executed.
//Program continues...
//
//Process finished with exit code 0