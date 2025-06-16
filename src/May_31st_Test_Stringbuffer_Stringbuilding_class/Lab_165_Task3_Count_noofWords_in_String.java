package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_165_Task3_Count_noofWords_in_String {
    public static void main(String[] args) {
        String s1 = "hello                      people i am             happy to learn java";

        // Step 1: Remove leading and trailing spaces
        s1.trim();

        // Step 2: Replace multiple spaces with a single space
        s1 = s1.replaceAll("\\s+", " ");
        System.out.println(s1);   //hello people i am happy to learn java

        // Step 3: Handle empty string case
        if (s1.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Step 4: Split string into words
            String[] words = s1.split(" ");

            // Step 5: Count the number of words
            System.out.println("Word count: " + words.length);     //Word count: 8

        }
    }
}
