package n_June_15th_Wrapper_Class;

public class Wrapper_P4 {
    public static void main(String[] args) {
        String num = "10";
        int aa = 10;

        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num); //(parseX())
        // Double.parseDouble(), Float.parseFloat();

        // String to Primitive
        int a_p = Integer.parseInt(num); // (String -> WP, WP -> primitve unboxing)

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);


        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);


    }
}
//10
//10
//true
//
//Process finished with exit code 0