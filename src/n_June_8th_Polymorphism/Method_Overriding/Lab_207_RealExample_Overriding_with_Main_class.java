package n_June_8th_Polymorphism.Method_Overriding;

public class Lab_207_RealExample_Overriding_with_Main_class {
    public static void main(String[] args) {

        TC_Chrome t1=new TC_Chrome();
        t1.openBrowser();      //Starting a chrome

        System.out.println();

        CommonToAllTC ct=new CommonToAllTC();
        ct.openBrowser();   //Open the browser!

    }
}

class CommonToAllTC{
    void openBrowser(){
        System.out.println("Open the browser!");
    }
}

class TC_Chrome extends CommonToAllTC{
    @Override
    void openBrowser(){
        System.out.println("Starting a chrome");
        //new ChromeDriver();
    }
}

//Starting a chrome

//Open the browser!

//Process finished with exit code 0