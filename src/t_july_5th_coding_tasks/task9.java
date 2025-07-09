package t_july_5th_coding_tasks;
//Exception Propagation Example
//Show how an exception propagates through method calls.
public class task9 {
    public static void main(String[] args) {
        ExceptionPropagationExample.methodC();
        System.out.println("Program continues after handling exception.");
    }
}
class ExceptionPropagationExample {

    public static void methodA() {
        // This is where the exception occurs
        int result = 10 / 0;  // ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void methodB() {
        methodA();  // No try-catch here, so it propagates
    }

    public static void methodC() {
        try {
            methodB();  // Exception is caught here
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in methodC: " + e);
        }
    }
}

//Exception caught in methodC: java.lang.ArithmeticException: / by zero
//Program continues after handling exception.
//
//Process finished with exit code 0