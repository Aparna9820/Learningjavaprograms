package May_11th_Class_Variables_DataTypes;

public class Lab_20_PrintF {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(a);
        System.out.printf("Your variable is %d", a);
        System.out.println();
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 20;
        //  A format string as described in Format string syntax
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("Your a value : %d , b value is %d", a, b);
        System.out.println();
    }
}



//Output: Your variable is 10
//a value is 10, b value is 20
//Your a value : 10 , b value is 20
