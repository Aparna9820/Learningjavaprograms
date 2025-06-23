package n_June_23rd_TASKS;
// Check if a Number is Divisible by 5 and 11
import java.util.Scanner;

public class Task1_no_Divisible_by_5and11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num=scanner.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println(num+ " number is divisible by both 5 & 11 ");
        }else
            System.out.println(num + " number is not divisible by both 5 & 11");

    }
}

//Enter Any Number
//55
//55 number is divisible by both 5 & 11
//
//Process finished with exit code 0
