package May_18th_if_class;

public class Lab_78_if_else_condition_using_Commandline_args {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }

    }
}
