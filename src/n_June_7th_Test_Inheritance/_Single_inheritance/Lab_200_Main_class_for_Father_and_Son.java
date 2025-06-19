package n_June_7th_Test_Inheritance._Single_inheritance;

public class Lab_200_Main_class_for_Father_and_Son {
    public static void main(String[] args) {
        Son_Class_Extends_Father s1= new Son_Class_Extends_Father();

        System.out.println(s1.father_gold);
        s1.BHK2();
        System.out.println();    //it prints total father class upto now

        s1.BHK3();  //it prints son class related data
        System.out.println();

        Cousin_class_without_extends_from_father c1= new Cousin_class_without_extends_from_father();

        c1.BHK4();  //we can access the data related Cousin only not father

       // System.out.println(c1.father_gold); //OUTPUT---> java: cannot find symbol
        //symbol:   variable father_gold
       // location: variable c1 of type n_June_7th_Test_Inheritance._Single_inheritance.Cousin_class_without_extends_from_father
    }
}
//200
//father has gold & BHK2 both
//
//son has BHK3

//Process finished with exit code 0


//after adding Cousin Output
//200
//father has gold & BHK2 both
//
//son has BHK3
//
//Cousin has 4BHK
//
//Process finished with exit code 0
