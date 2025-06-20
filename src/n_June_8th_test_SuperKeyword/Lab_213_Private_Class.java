package n_June_8th_test_SuperKeyword;

public class Lab_213_Private_Class {

}
class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}
