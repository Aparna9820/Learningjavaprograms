package n_June_14th_Absraction_Interface;

public class Lab_228_Interface_P2 {
    public static void main(String[] args) {
        Class Cl= new Class();
        Cl.functions();
    }
}
class Class implements I1,I2{
    void functions(){
        fun1();
        fun2();
        fun3();
        fun4();

    }

    @Override
    public void fun1() {
        System.out.println("Function1");
    }

    @Override
    public void fun4() {
        System.out.println("Function4");
    }

    @Override
    public void fun3() {
        System.out.println("Function3");
    }

    @Override
    public void fun2() {
        System.out.println("Function2");
    }
}
interface I1{
    void fun1();
    void fun2();
}
interface I2{
    void fun4();
    void fun3();
}

//Function1
//Function2
//Function3
//Function4

//Process finished with exit code 0