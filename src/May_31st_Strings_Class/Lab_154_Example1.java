package May_31st_Strings_Class;

public class Lab_154_Example1 {
    public static void main(String[] args) {
        String s="Aparna";
        char c=s.charAt(2);
        System.out.println(s);
        System.out.println(c);  //a
        System.out.println(s.codePointAt(0));   //it returns int value as A=65
        System.out.println(s.codePointAt(1));  //112--->ASCII Value of p


        int r1="abc".compareTo("ABC");
        int r2="abc".compareToIgnoreCase("ABC");
        System.out.println(r1);  //32
        System.out.println(r2);  //0


        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

    }
}
