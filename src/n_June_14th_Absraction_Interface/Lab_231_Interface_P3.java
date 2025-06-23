package n_June_14th_Absraction_Interface;

public class Lab_231_Interface_P3 {
    public static void main(String[] args) {
        Appu A=new Appu();
        A.display();
        System.out.println(A.a);
    }
}
class Appu implements yedubati{

    @Override
    public void display() {
        System.out.println("print Interface");
        System.out.println(a);
    }
}
interface yedubati{
    int a=10;
    void display();
}

//print Interface
//10
//10

//Process finished with exit code 0