package May_17th_Type_Casting;

public class Lab_61_TypeCasting_Widening2 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
        System.out.println(a);   //10
        System.out.println(a1);   //10
    }
}
