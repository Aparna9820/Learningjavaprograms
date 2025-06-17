package n_June_1st_Array_Class;

public class Lab_173_Arrays_Max_Min_Using_forloop {
    public static void main(String[] args) {
        int [] num={2,67,89,0};
        int max=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max)
                max=num[i];
        }
        System.out.println("Maximum number of array is " + max);
        System.out.println();

        int min=num[0];
        for(int i=0; i<num.length; i++) {
            if (num[i] <= min)
                min = num[i];
        }
        System.out.println("minimum number of array is " + min);
    }
}
