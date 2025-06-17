package May_31st_TASKS_Stringbuffer_Stringbuilding_class;

public class Lab_162_InterviewQue {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);    //Java Programming
//        sb.delete(5,16); // Delete the substring
//        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);      //C++ Programming


    }
}
