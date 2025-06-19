package n_June_7th_OOPs_Cocept;

public class Lab_198_Parametarized_Const_using_Car2 {
    String model;
    int year;

    Lab_198_Parametarized_Const_using_Car2(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");  //Default Constructor
    }

    Lab_198_Parametarized_Const_using_Car2(String model_name, int year_Created){
        this.model=model_name;
        this.year=year_Created;
    }

    Lab_198_Parametarized_Const_using_Car2(String model_name){
        this.model=model_name;
        // *** constructor having same name but parameters different then it called as Constructor Overloading
    }

}
