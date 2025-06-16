package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_158_StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Aparna");
        StringBuilder stringBuilder=new StringBuilder("Aparna");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
    }
}
//Aparna
//Aparna
//anrapA
//anrapA
//
//Process finished with exit code 0