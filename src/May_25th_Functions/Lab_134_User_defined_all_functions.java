package May_25th_Functions;

public class Lab_134_User_defined_all_functions {
    public static void main(String[] args) {
        withoutparameter_withoutreturn_func();
        System.out.println();

        String msg= withoutparameter_withreturn_func();
        System.out.println(msg);
        System.out.println();

        withparameter_withoutreturn_func("Aparna", 23, 450000);
        System.out.println();
        // Scanner scanner = new Scanner(System.in); by using scanner input also we can define
        //        System.out.println("ENTER NAME");
        //        String name = scanner.next();
        //        System.out.println("ENTER AGE");
        //        int age = scanner.nextInt();
        //        System.out.println("ENTER SALARY");
        //        double salary = scanner.nextDouble();
        //
        //        withparameter_withoutreturn_func(name, age, salary);


        int result=withparameter_withreturn_func(4,5);
        System.out.println(result);


    }
    static void withoutparameter_withoutreturn_func(){
        System.out.println("hi Appu");
    }
    static String withoutparameter_withreturn_func(){
        System.out.println("hi, how are you");
        return "hi are you";
    }
    static void withparameter_withoutreturn_func(String name, int age, double salary){
        System.out.println("your name "+name +"\nYour age is " + age + "\nYour salary is " + salary);
    }

    static int withparameter_withreturn_func(int a, int b){
        return a+b;
    }
}
