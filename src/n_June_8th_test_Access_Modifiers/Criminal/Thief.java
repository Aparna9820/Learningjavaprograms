package n_June_8th_test_Access_Modifiers.Criminal;

import n_June_8th_test_Access_Modifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(10);
//        thief.canIShoot();  //can't shoot because that is in protected stage
//        System.out.println(thief.gun);
    }
}
