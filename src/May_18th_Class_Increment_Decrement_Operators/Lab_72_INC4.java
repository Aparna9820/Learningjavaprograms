package May_18th_Class_Increment_Decrement_Operators;

public class Lab_72_INC4 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // output----> ExpA+ExpB -> 11+12 -> 23, a -> 12



    }
}
