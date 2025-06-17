package n_June_1st_Array_Class;

public class Lab_174_Arrays_Max_Min_Using_functions {
    public static void main(String[] args) {
        int [] num={23,0,89,90,29,70};
        int max = max_number_func(num);

        int min=min_number_func(num);

        System.out.println("max number of an array     " +max);
        System.out.println("min number of an array     " +min);
    }


    static int max_number_func(int [] num ){
        int max=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max)
                max=num[i];
        }
        return max;
    }

    static int min_number_func(int [] num){
        int min=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]<=min)
                min=num[i];
        }
        return min;
    }

}
