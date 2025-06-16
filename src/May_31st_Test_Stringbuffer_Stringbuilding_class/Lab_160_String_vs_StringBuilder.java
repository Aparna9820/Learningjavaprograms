package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_160_String_vs_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Aparna");
        stringBuilder.append(123);
        System.out.println(stringBuilder);  //in SCP only one string is available i.e----> Aparna123

        String s1="Aparna";
        s1=s1+ 123;
        System.out.println(s1);   //in SCP 2 strings were available 1.Aparna & 2.Aparna123
    }
}
//Aparna123
//Aparna123
//
//Process finished with exit code 0