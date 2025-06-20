package n_June_20th_TASKS;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
            System.out.println("enter Any number");
            Scanner scanner= new Scanner(System.in);
            int num= scanner.nextInt();
            int num2=num; //num assigned to num2(original value)
            int n=1,result=0;
            while(num2>0){
                n=num2%10;
                result=result+(n*n*n);
                num2=num2/10;
            }
            if(result==num)
                System.out.println("Armstrong number");
            else
                System.out.println("not Armstrong number");
        }
    }

