package May_25th_Functions;

public class Lab_133_User_Defined_Func {
    public static void main(String[] args) {
        int result1=sum_of_2_numbers(3,5);
        int result2=sum_of_2_numbers(6,50);

        System.out.println(result1);
        System.out.println(result2);
    }
    static int sum_of_2_numbers(int a,int b){
        return a+b;
    }
}
