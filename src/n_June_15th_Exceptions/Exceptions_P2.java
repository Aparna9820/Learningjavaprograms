package n_June_15th_Exceptions;

public class Exceptions_P2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        // UnChecked -> ArithmeticException, NullPointerException


        String name = null;
        name.trim();
        // java.lang.NullPointerException: Cannot invoke "String.trim()"


    }
}
