package May_25th_Functions;

public class Lab_132_Simple_Method {
    public static void main(String[] args) {

        ///= no return type or void does not return any.

        non_return_type_func();

        System.out.println();

        String msg = return_type_func();
        System.out.println(msg);
    }
    // Non return type function does not return anything, only printing.
    static void non_return_type_func(){
        System.out.println("hello");
    }
    // Return type function, it will return a particular data type.
    static String return_type_func(){
        System.out.println("hi");
        return "hello";
    }
}
