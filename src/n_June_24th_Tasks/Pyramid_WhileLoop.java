package n_June_24th_Tasks;

public class Pyramid_WhileLoop {
    public static void main(String[] args) {
        int num1=4;
        int i=1;
        while(i<=num1){
            int j=1;
            int k=1;
            while(j<=num1-i){
                System.out.print(" ");
                j++;}
            while(k<=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
//   *
//  ***
// *****
//*******
//
//Process finished with exit code 0