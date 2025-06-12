package May_17th_Type_Casting;

public class Lab_60_Typecasting_Widening {
    public static void main(String[] args) {
        byte b=56;
        int a=b;    //widening typecast because there is no data loss & byte is smaller than int
        System.out.println(a);
    }
}
//Valid syntax -> smaller data into the bigger data type
//        // Implicit - Casting - Widening
