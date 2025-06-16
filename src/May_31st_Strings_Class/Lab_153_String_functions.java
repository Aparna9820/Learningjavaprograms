package May_31st_Strings_Class;

public class Lab_153_String_functions {
    public static void main(String[] args) {
//        String s1="HELLO"; // SCP
//        String s2= new String("world"); // OA

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);  //false
        System.out.println(str1.equals(str3));  //true

        System.out.println(str1.concat(str3)); //HelloHello
    }
}
