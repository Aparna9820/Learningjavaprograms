package t_july_5th_coding_tasks;
//Catch Multiple Exceptions
//Write a program that catches both `ArithmeticException` and `ArrayIndexOutOfBoundsException`.

public class task4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // This may cause ArithmeticException (division by zero)
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);

            // This may cause ArrayIndexOutOfBoundsException
            System.out.println("Accessing index 5: " + numbers[5]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }

}
//Caught exception: java.lang.ArithmeticException: / by zero
//Program continues after exception handling.
//
//Process finished with exit code 0