package n_June_12th_TASKS;

//Multilevel Inheritance Program
// Desc: Create class Grandparent → Parent → Child and demonstrate multilevel inheritance.

public class Lab_220_Task2_Multilevel_inhe {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.C_home();
        c1.GP_home();
        c1.P_home();
        System.out.println();

        Parent p1=new Parent();
        p1.P_home();
        p1.GP_home();
        System.out.println();

        Grandparent g1=new Grandparent();
        g1.GP_home();
        System.out.println();

        Grandparent g2=new Parent();   //dynamic dispathc
        g2.GP_home();
        System.out.println();

       // Child c2= new Parent();  //not possible because we are unable toassign the parent to son

        Parent p2= new Child();
        p2.GP_home();
        p2.P_home();

    }
}
class Grandparent{
    void GP_home(){
        System.out.println("GP has the home1");
    }
}

class Parent extends Grandparent{
    void P_home(){
        System.out.println("parent has home2");
    }
}

class Child extends Parent{
    void C_home(){
        System.out.println("Child has Home3");
    }
}
