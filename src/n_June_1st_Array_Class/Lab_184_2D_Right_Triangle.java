package n_June_1st_Array_Class;

import java.util.Scanner;

public class Lab_184_2D_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number!");
        int n= scanner.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
//enter any number!
//6
//*
//**
//***
//****
//*****
//******
//
//Process finished with exit code 0