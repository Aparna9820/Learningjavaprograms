package n_June_15th_Exceptions;

public class Exceptions_P1 {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException----> if we are not giving the output from CLI
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException---->Giving ip as String otherthan Int
        int b = 100/a; // java.lang.ArithmeticException: /--> by zero(a as zero)

        System.out.println(b);
        System.out.println("End the program");
    }
}
