package t_July_5th_coding_tasks;
//Generic Swap Method
//Write a generic method to swap two elements in an array.
public class task3 {
    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] numbers = {1, 2, 3, 4};
        System.out.println("Before swap: ");
        for (int n : numbers) System.out.print(n + " ");

        GenericSwap.swap(numbers, 1, 3);

        System.out.println("\nAfter swap: ");
        for (int n : numbers) System.out.print(n + " ");

        // Example usage with String array
        String[] words = {"apple", "banana", "cherry"};
        System.out.println("\n\nBefore swap: ");
        for (String w : words) System.out.print(w + " ");

        GenericSwap.swap(words, 0, 2);

        System.out.println("\nAfter swap: ");
        for (String w : words) System.out.print(w + " ");
    }

    public class GenericSwap {

        // Generic method to swap elements at index i and j in an array
        public static <T> void swap(T[] array, int i, int j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

//Before swap:
//1 2 3 4
//After swap:
//1 4 3 2
//
//Before swap:
//apple banana cherry
//After swap:
//cherry banana apple
//Process finished with exit code 0