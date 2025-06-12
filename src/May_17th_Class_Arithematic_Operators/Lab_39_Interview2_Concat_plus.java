package May_17th_Class_Arithematic_Operators;

public class Lab_39_Interview2_Concat_plus {
    public static void main(String[] args) {
        String s1="Aparna";
        String s2="Yedubati";
        int a=10, b=20;
        System.out.println(s1+s2+a+b);
        System.out.println(a+b+s1+s2);
        System.out.println(a+s1+s2+b);
        System.out.println(a+s1+b+s2);
        System.out.println(s1+s2+(a+b));
    }
}
// output--->
//AparnaYedubati1020
//30AparnaYedubati
//10AparnaYedubati20
//10Aparna20Yedubati
//AparnaYedubati30
//Process finished with exit code 0

