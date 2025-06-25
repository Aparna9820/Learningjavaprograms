package n_June_24th_Tasks;

import java.util.Scanner;

public class Multiplication_table_by_user_Iput_Forloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Table number: ");
        int n= scanner.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(n +"*"+i +" = "+(n*i));
        }
    }
}
//Enter the Table number:
//6
//6*1 = 6
//6*2 = 12
//6*3 = 18
//6*4 = 24
//6*5 = 30
//6*6 = 36
//6*7 = 42
//6*8 = 48
//6*9 = 54
//6*10 = 60
//
//Process finished with exit code 0