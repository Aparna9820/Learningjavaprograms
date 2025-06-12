package May_17th_Ternary_Operator;

public class Lab_59_TASK3_Age_classification {
    public static void main(String[] args) {

        // age = 78 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        int age=78;
        String Result= (age<18) ? "Minor": (age<65) ? "Adult": "Senior";
        System.out.println(Result);
    }
}
