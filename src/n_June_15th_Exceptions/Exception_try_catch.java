package n_June_15th_Exceptions;

public class Exception_try_catch {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            e.printStackTrace();   //NullPointerException
        }
    }
}
