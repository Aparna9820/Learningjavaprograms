package May_17th_Ternary_Operator;

public class Lab_58_TASK2_Max_of_3Numbers {
    public static void main(String[] args) {
        int a=89, b=67, c=102;
        int max= (a>b) ? (a>c)? a : c: ((b>c) ? b : c);
        System.out.println(max);
    }
}
// int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
