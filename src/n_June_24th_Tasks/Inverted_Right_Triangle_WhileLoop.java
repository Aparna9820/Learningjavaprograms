package n_June_24th_Tasks;

public class Inverted_Right_Triangle_WhileLoop {
    public static void main(String[] args) {
        int i=5;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
//*****
//****
//***
//**
//*
//
//Process finished with exit code 0