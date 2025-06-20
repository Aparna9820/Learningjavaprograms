package n_June_17th_Tasks_If_else;

import java.util.Scanner;
//Check if a Number is Positive or Negative.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = scanner.nextInt();
        if (n>0) {
            System.out.println("Given Number is Positive Number");
        }else if(n<0) {
            System.out.println("Given Number is Negetive Number");
        }else
            System.out.println("Given number is Zero-->0");
    }
}
//Enter any Number
//9
//Given Number is Positive Number
//
//Process finished with exit code 0