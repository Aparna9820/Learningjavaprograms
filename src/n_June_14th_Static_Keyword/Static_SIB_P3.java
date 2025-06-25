package n_June_14th_Static_Keyword;

public class Static_SIB_P3 {
    public static void main(String[] args) {
        A a=new A();
    }
}
class A {
    static {
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }

    static int a = 10;

    static void m1() {
        System.out.println("static function");
    }
}

//Called only Once when Class is loaded
//You can write a code reading a excel, file, , database file
//
//Process finished with exit code 0