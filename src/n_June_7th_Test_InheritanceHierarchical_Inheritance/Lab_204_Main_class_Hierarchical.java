package n_June_7th_Test_InheritanceHierarchical_Inheritance;

public class Lab_204_Main_class_Hierarchical {
    public static void main(String[] args) {
        Child1_class c1=new Child1_class();
        c1.son1();
        c1.Father();
        System.out.println();


        Child2_class c2= new Child2_class();
        c2.son2();
        c2.Father();
        System.out.println();

        Child3_class c3=new Child3_class();
        c3.son3();
        c3.Father();

    }
}
//1st child
//father having 3 Childs
//
//2nd child
//father having 3 Childs
//
//3rd child
//father having 3 Childs
//
//Process finished with exit code 0