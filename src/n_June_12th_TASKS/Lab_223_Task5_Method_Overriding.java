package n_June_12th_TASKS;
// Method Overriding in Inheritance Program

// Description: Demonstrate how method overriding works.

public class Lab_223_Task5_Method_Overriding {
    public static void main(String[] args) {
        ICICI b1= new ICICI();
        System.out.println("ICICI interest rate:  " + b1.interest_rate());

        SBI b2= new SBI();
        System.out.println("SBI interest rate:  " + b2.interest_rate());

        Bank b3= new Bank();
        System.out.println("Bank interest rate: " + b3.interest_rate());

    }
}

class Bank{
    int interest_rate(){
        return 9;
    }
}

class ICICI extends Bank{
    @Override
    int interest_rate(){
        return 8;
    }
}

class SBI extends Bank{
    @Override
    int interest_rate() {
        return 5;
          }
    }