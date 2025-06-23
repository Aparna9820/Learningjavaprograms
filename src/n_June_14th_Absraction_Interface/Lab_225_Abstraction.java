package n_June_14th_Absraction_Interface;

public class Lab_225_Abstraction {
    public static void main(String[] args) {
        Son s1= new Son();
        s1.loan50k();

        //father1=new father1();  //--->it shows error because father1 is Abstract Class
    }
}
class N{
    //complete Class
}
abstract class father1{
    abstract void loan50k();  //incomplete functions only in Abstract class
}
class Son extends father1{
    @Override
    void loan50k(){
        System.out.println("loan done by Son");
    }

}


//loan done by Son
//
//Process finished with exit code 0