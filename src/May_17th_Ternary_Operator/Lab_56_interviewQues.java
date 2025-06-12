package May_17th_Ternary_Operator;

public class Lab_56_interviewQues {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));  //20

        int max = x > y ? x : y;
        System.out.println(max);   //20
    }
}
