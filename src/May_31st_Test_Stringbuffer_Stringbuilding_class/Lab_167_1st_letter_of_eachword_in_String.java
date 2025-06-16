package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_167_1st_letter_of_eachword_in_String {
    public static void main(String[] args) {
        String str = "i am very     happy to learn java ";

        // Add a space at the beginning to handle the first word easily
        str = " " + str;

        // Loop through the string to find first letters
        for (int i = 0; i < str.length() - 1; i++) {
            // Check if current character is space and next character is a letter
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                System.out.print(str.charAt(i + 1));
                System.out.println();
                //System.out.println(str.charAt(i + 1));
            }
        }
    }
}
