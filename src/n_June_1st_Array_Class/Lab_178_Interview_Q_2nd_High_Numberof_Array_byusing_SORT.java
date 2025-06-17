package n_June_1st_Array_Class;

import java.util.Arrays;

public class Lab_178_Interview_Q_2nd_High_Numberof_Array_byusing_SORT {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);  //2nd highest number
        System.out.println(numbers[numbers.length - 3]);   //3rd highest number
        System.out.println(numbers[numbers.length - 4]);   //4th highest number
        System.out.println(numbers[numbers.length - 1]);   //1st highest number
    }
}
