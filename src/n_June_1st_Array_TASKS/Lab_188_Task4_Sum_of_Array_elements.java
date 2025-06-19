package n_June_1st_Array_TASKS;

public class Lab_188_Task4_Sum_of_Array_elements {
    public static void main(String[] args) {
        int [] numbers={9,6,7,8,0};
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println("Sum of Array elements is "+ sum);
    }
}
