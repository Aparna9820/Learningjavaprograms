package n_June_15th_Wrapper_Class;

public class Wrapper_P7 {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // Boxing - int -> Integer - AutoBoxing - JVM will do it.
        System.out.println(a);
        System.out.println(b.intValue());


        // UnBoxing
        Integer aa = 43;
        int a1 = aa; // UNBOXING
        System.out.println(a1);
        System.out.println();

    }
}
//10
//10
//43

//Process finished with exit code 0