package Codeing_Que_EXAM2_OOPS_Concepts;
//Method Overriding Demo
//Write a program to demonstrate method overriding by creating parent and child classes with the same method signature.
public class Q12 {
    public static void main(String[] args) {
        parent p1=new parent();
        p1.Signature();
        System.out.println();

        Child c1= new Child();
        c1.Signature();
        System.out.println();

        parent p2= new Child();
        p2.Signature();
    }
}
class parent{
    void Signature(){
        System.out.println("Parent Signature");
    }
}
class Child extends parent{
    @Override
    void Signature(){
        System.out.println("Child Signature");
    }
}
//Parent Signature
//
//Child Signature
//
//Child Signature
//
//Process finished with exit code 0