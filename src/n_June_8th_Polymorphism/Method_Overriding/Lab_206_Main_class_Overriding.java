package n_June_8th_Polymorphism.Method_Overriding;

public class Lab_206_Main_class_Overriding {
    public static void main(String[] args) {
        CHILD_CLASS c1= new CHILD_CLASS();

        c1.Child();
        c1.home();   //here father home method overrides with child
        c1.father();
        System.out.println();

        FATHER_CLASS f1= new FATHER_CLASS();
        f1.father();
        f1.home();
        System.out.println();

        FATHER_CLASS f2= new CHILD_CLASS();   //dynamic dispatch
        f2.home();      //it prints the Overridden home function in Child class
    }
}

//Child class Executes
//Child has 7BHK Home
//father class executes!

//father class executes!
//father has 5BHK home

//Child has 7BHK Home

//Process finished with exit code 0