package n_June_19th_TASKS;

public class Smallest_of_3_numbers {
    public static void main(String[] args) {
        int a=10,b=5,c=67;
        if (a<b && a<c){
            System.out.println("a Is the smallest number:  " +a);
        }else if(b<a && b<c){
            System.out.println("b is the smallest number:  " +b);
        }else
            System.out.println("c is the smallest number:  " +c);
    }
}
