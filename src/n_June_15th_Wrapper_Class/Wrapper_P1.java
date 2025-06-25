package n_June_15th_Wrapper_Class;

public class Wrapper_P1 {
    public static void main(String[] args) {
        ATB a=new ATB();
        a.print();
    }
}
class ATB{
    String name= "Appu";  //it's normal Primitive datatype
    void print(){
        System.out.println(" hi "+ name);
    }
}