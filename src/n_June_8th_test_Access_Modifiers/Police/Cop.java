package n_June_8th_test_Access_Modifiers.Police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;  //this can be accessed by Jr Cop
    }

    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
        //this can be accessed by the jr cop because jr cop is in this package only
    }


    private void defaultFunction(){
                      //default like protected
    }

}
