package May_31st_TASKS_Stringbuffer_Stringbuilding_class;

public class Lab_163_Task1_InterviewQ_ReverseString_using_forloop {
    public static void main(String[] args) {
        String s1="Aparna";
        for( int i=s1.length()-1; i>=0;i--) {
            System.out.print(s1.charAt(i));   //anrapA---->without using inbuild function
        }
        System.out.println();

        StringBuffer sb= new StringBuffer("yedubati");
        sb.reverse();
        System.out.println(sb);   //itabudey---->using inbuild function
    }
}
