package n_June_24th_Tasks;

public class Inverted_Pyramid_WhileLoop {
    public static void main(String[] args) {
        int num1=5;
        int i=num1;
        while(i>=1){
            int j=num1-i;
            int k=(2*i-1);
            while(j>=1){
                System.out.print(" ");
                j--;}
            while(k>=1){
                System.out.print("*");
                k--;
            }
            System.out.println();
            i--;
        }
    }
}

//*********
// *******
//  *****
//   ***
//    *
//
//Process finished with exit code 0