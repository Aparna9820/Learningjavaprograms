package n_June_15th_Exceptions;

public class Exception_P4 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());  //e nothing but reference
        }
        System.out.println(c);
    }
}
/// by zero
//0
//
//Process finished with exit code 0