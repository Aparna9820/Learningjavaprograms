package n_June_24th_Tasks;

public class Inverted_Pyramid_ForLoop {
    public static void main(String[] args) {
        int num = 4;
        for (int i = num; i >= 1; i--) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*******
// *****
//  ***
//   *
//
//Process finished with exit code 0