package n_June_1st_Array_TASKS;

import java.util.Scanner;

public class Lab_187_Task3Smallest_element_in_Array_by_user_inputs {
    public static void main(String[] args) {
        //int [] mark={90,0,1,5,6,2};
        Scanner scaneer=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size= scaneer.nextInt();

        int[] mark=new int[size];

        System.out.println("enter the "+size  +" numbers");
        for (int i = 0; i < size; i++) {
            mark[i] =scaneer.nextInt();
        }

        int smallest=mark[0];
        for(int i=0;i<size;i++){
            if(mark[i]<smallest){
                smallest=mark[i];
            }

        }
        System.out.println("Smallest number in array is " + smallest);
    }
}
