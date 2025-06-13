package May_25th_TASKS;

public class Lab_139_task3_Reverse_the_number {
    public static void main(String[] args) {
        int num=67898;
        int rev=0;
        int r;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("Reverse number "+ rev);

    }
}
