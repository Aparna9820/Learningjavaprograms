package May_25th_TASKS;

import java.util.Scanner;

public class Lab_143_task7_Armstrong_number {
    public static void main(String[] args) {
        System.out.println("enter Any number");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        int num2=num; //num assigned to num2(original value)
        int n=1,result=0;
        while(num>0){
            n=num%10;
            result=result+(n*n*n);
            num=num/10;
        }
        if(result==num2)
            System.out.println("Armstrong number");
        else
            System.out.println("not Armstrong number");
    }
}
