package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_159_String_vs_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Aparna");
        stringBuffer.append("Yedubati");
        System.out.println(stringBuffer);  //in SCP only one string is available i.e----> AparnaYedubati

        String s1="Aparna";
        s1=s1+ "Yedubati";
        System.out.println(s1);   //in SCP 2 strings were available 1.Aparna & 2.AparnaYedubati
    }
}
//AparnaYedubati
//AparnaYedubati
//
//Process finished with exit code 0