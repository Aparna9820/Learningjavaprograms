package n_June_19th_TASKS;

public class Largest_of_3_numbers {
    public static void main(String[] args) {
        int a = 10, b = 40, c = 0;
        if (a > b && a > c) {
            System.out.println(" a is the largest number : " + a);
        } else if (b > a && b > c) {
            System.out.println(" b is the largest number : " + b);
        } else
            System.out.println(" c is the largest number : " + c);


//Conditional operator
//        int a = 10, b = -40, c = 100;
//        int max = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
//        System.out.println("max nuber is "+ max);
    }}