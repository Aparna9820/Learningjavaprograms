package n_June_8th_Polymorphism.Method_Overloading;

public class Lab_205_main_class_for_Mathoperations {
    public static void main(String[] args) {
        mathoperations_class m1= new mathoperations_class();

        int r1=m1.add(3,4,5);
        System.out.println(r1);


        int r2=m1.add(9,0);
        System.out.println(r2);

        //int r3=m1.add(90,89,89,78); //no suitable method found for add(int,int,int,int) parameters didn't match
        //System.out.println(r3);

        double r4= m1.add(67.890,78.890);
        System.out.println(r4);
    }
}
