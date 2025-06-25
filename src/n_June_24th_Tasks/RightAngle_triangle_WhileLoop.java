package n_June_24th_Tasks;

import java.util.Scanner;

public class RightAngle_triangle_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= scanner.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//Enter the number:
//4
//*
//**
//***
//****

//Process finished with exit code 0