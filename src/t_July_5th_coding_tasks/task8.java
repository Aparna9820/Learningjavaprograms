package t_July_5th_coding_tasks;
//Generic Method to Print Array
//Write a generic method to print any type of array.
import static t_July_5th_coding_tasks.GenericArrayPrinter.printArray;

public class task8 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"apple", "banana", "cherry"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.print("Integer array: ");
        printArray(intArray);

        System.out.print("String array: ");
        printArray(strArray);

        System.out.print("Double array: ");
        printArray(doubleArray);
    }
}
class GenericArrayPrinter {

    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

//Integer array: 1 2 3 4
//String array: apple banana cherry
//Double array: 1.1 2.2 3.3
//
//Process finished with exit code 0