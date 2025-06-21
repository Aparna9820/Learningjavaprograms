package Coding_test_Questions;
//Increment and Decrement Operators
//Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//**Requirements:**
//- Show the difference between ++i and i++
//- Show the difference between --i and i--
//- Print values before and after operations
public class Question4 {
    public static void main(String[] args) {
        int i = 5;

        // Pre-increment
        System.out.println("Pre-increment (++i):");
        System.out.println("Before: " + i);
        System.out.println("Operation result: " + (++i));  // increments first, then prints
        System.out.println("After: " + i);

        // Reset i
        i = 5;

        // Post-increment
        System.out.println("\nPost-increment (i++):");
        System.out.println("Before: " + i);
        System.out.println("Operation result: " + (i++));  // prints first, then increments
        System.out.println("After: " + i);

        // Reset i
        i = 5;

        // Pre-decrement
        System.out.println("\nPre-decrement (--i):");
        System.out.println("Before: " + i);
        System.out.println("Operation result: " + (--i));  // decrements first, then prints
        System.out.println("After: " + i);

        // Reset i
        i = 5;

        // Post-decrement
        System.out.println("\nPost-decrement (i--):");
        System.out.println("Before: " + i);
        System.out.println("Operation result: " + (i--));  // prints first, then decrements
        System.out.println("After: " + i);
    }
}
//Pre-increment (++i):
//Before: 5
//Operation result: 6
//After: 6
//
//Post-increment (i++):
//Before: 5
//Operation result: 5
//After: 6
//
//Pre-decrement (--i):
//Before: 5
//Operation result: 4
//After: 4
//
//Post-decrement (i--):
//Before: 5
//Operation result: 5
//After: 4
//
//Process finished with exit code 0