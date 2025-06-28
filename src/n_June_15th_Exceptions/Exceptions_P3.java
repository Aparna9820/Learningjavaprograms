package n_June_15th_Exceptions;

public class Exceptions_P3 {
    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
