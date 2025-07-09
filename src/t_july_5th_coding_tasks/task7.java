package t_july_5th_coding_tasks;
//Wrapper Class: Find Max Value
//Find the maximum value in an array of Integer objects.
public class task7 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 10, 3, 20, 15};
        Integer maxValue = MaxValueFinder.findMax(numbers);
        System.out.println("Maximum value is: " + maxValue);
    }
}
class MaxValueFinder {
    public static Integer findMax(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;  // or throw an exception if preferred
        }

        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
//Maximum value is: 20

//Process finished with exit code 0