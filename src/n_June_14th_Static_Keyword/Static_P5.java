package n_June_14th_Static_Keyword;

public class Static_P5 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }
}
class Automation{
    static String driver = "Chrome";
    static String driver2;
}


//Chrome
//Chrome
//Firefox
//null

//Process finished with exit code 0