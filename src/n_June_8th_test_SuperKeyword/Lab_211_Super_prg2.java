package n_June_8th_test_SuperKeyword;

public class Lab_211_Super_prg2 {
        public static void main(String[] args) {

            Father f1= new Father();
            Son s1= new Son();
            f1.home();
            s1.bike();
            s1.home();

        }
    }


    class Father {
        Father() {
            System.out.println("DC Father");
        }

        int gold = 10;

        void home() {
            System.out.println("Home Father");
        }
    }

    class Son extends Father {

        Son(){
            super();
        }

        void bike(){}

        void newHome() {
            super.home();
            System.out.println(super.gold);

            this.bike();
        }


    }
//DC Father
//DC Father
//Home Father
//Home Father
//
//Process finished with exit code 0