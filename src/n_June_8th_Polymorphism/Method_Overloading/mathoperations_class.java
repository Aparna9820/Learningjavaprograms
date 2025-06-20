package n_June_8th_Polymorphism.Method_Overloading;

public class mathoperations_class {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;

        //here 2 methods are having the same name as "add" but the parameters were Different
    }

    double add(double a, double b){
        return a+b;
    }

}
