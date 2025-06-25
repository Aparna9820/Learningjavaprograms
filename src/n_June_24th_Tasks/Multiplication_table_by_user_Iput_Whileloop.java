package n_June_24th_Tasks;

import java.util.Scanner;

public class Multiplication_table_by_user_Iput_Whileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Table number: ");
        int n= scanner.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n +"*"+i +" = "+(n*i));
            i++;
        }
    }
}
//Enter the Table number:
//3
//3*1 = 3
//3*2 = 6
//3*3 = 9
//3*4 = 12
//3*5 = 15
//3*6 = 18
//3*7 = 21
//3*8 = 24
//3*9 = 27
//3*10 = 30
//
//Process finished with exit code 0