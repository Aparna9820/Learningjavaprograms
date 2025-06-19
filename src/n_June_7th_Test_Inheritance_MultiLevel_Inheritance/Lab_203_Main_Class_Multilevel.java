package n_June_7th_Test_Inheritance_MultiLevel_Inheritance;

public class Lab_203_Main_Class_Multilevel {
    public static void main(String[] args) {
        Son_class s1=new Son_class();
        Father_class f1= new Father_class();
        _Grand_father_class gf1= new _Grand_father_class();

        s1.S();       //
        s1.F();
        s1.GF();
        s1.home();
        System.out.println();   //upto now son has access to father & GF data
        //son extends from Father class
        //son has 6BHK
        //Father having 5BHK
        //Father extends from GF!
        //GF function
        //GF has 1BHK home

        f1.F();
        f1.home();
        f1.GF();
        System.out.println();  //upto now father access GF data only not son

        //Father having 5BHK
        //Father extends from GF!
        //GF has 1BHK home
        //GF function

        gf1.GF();
        gf1.home();
        System.out.println();   // it prints only GF Data

        //GF function
        //GF has 1BHK home


        //### Dynamic Dispatch
        Son_class s2= new Son_class();
      //  Son_class s3= new Father_class();  //not possible

        Father_class f2=new Son_class(); // Dynamic Dispatch. because son extends from the father
        //Father_class f3=new _Grand_father_class(); //not possible


        _Grand_father_class gf2= new Father_class();
        _Grand_father_class gf3= new Son_class();
        _Grand_father_class gf4= new _Grand_father_class();

    }
}
