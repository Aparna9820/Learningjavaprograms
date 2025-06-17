package n_June_1st_Array_Class;

import java.util.Scanner;

public class Lab_183_2D_Left_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();

        for(int i=n; i>0;i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
//enter the number
//5
//*****
//****
//***
//**
//*
//
//Process finished with exit code 0