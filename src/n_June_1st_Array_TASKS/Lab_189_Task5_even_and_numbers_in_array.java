package n_June_1st_Array_TASKS;

public class Lab_189_Task5_even_and_numbers_in_array {
    public static void main(String[] args) {
        int a[] = {4, 56, 77, 79, 95, 78, 90};
        System.out.println(a.length);
        String evennumbers = " ";
        String oddnumbers = " ";
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evennumbers += a[i] + " ";
            } else {
                oddnumbers += a[i] + " ";
            }

        }
        System.out.print("even numbers in array" + evennumbers);
        System.out.println();
        System.out.print("odd numbers in array" + oddnumbers);
    }
}
