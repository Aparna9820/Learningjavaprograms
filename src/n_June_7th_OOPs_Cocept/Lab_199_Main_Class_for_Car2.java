package n_June_7th_OOPs_Cocept;

public class Lab_199_Main_Class_for_Car2 {
    public static void main(String[] args) {
        Lab_198_Parametarized_Const_using_Car2 texa = new Lab_198_Parametarized_Const_using_Car2();
        System.out.println(texa.model);
        System.out.println(texa.year);
        System.out.println();


        Lab_198_Parametarized_Const_using_Car2 nano = new Lab_198_Parametarized_Const_using_Car2("nano", 2025);
        System.out.println(nano.model);
        System.out.println(nano.year);
        System.out.println();

        Lab_198_Parametarized_Const_using_Car2 meta = new Lab_198_Parametarized_Const_using_Car2("meta");
        System.out.println(meta.model);
    }
}
//DC
//XXX
//1900
//
//nano
//2025
//
//meta

//Process finished with exit code 0