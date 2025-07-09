package t_July_5th_coding_tasks;
//Generic Bounded Type Example
//Write a generic method that accepts only numbers and returns their sum.
import static t_July_5th_coding_tasks.BoundedTypeSum.sum;

public class task10 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.println("Sum of integers: " + sum(intArray));
        System.out.println("Sum of doubles: " + sum(doubleArray));
    }
}
class BoundedTypeSum {

    // Generic method that accepts only Number or its subclasses
    public static <T extends Number> double sum(T[] numbers) {
        double total = 0.0;
        for (T num : numbers) {
            if (num != null) {
                total += num.doubleValue(); // Convert to double for addition
            }
        }
        return total;
    }
}

//Sum of integers: 10.0
//Sum of doubles: 7.5
//
//Process finished with exit code 0