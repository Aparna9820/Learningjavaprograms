package n_June_1st_Array_TASKS;

public class Lab_186_Task2_Largest_element_in_Array {
    public static void main(String[] args) {
        int [] num={45,67,89,90,12};
        int largest= num[0];
        for(int i=0;i<num.length-1;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("Largest numner in array is "+ largest);
    }
}
