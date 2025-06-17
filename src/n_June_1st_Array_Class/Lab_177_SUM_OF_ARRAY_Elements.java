package n_June_1st_Array_Class;

public class Lab_177_SUM_OF_ARRAY_Elements {
    public static void main(String[] args) {
        int [] num={2,3,4,5};
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
