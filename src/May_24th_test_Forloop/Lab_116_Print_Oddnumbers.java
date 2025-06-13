package May_24th_test_Forloop;

public class Lab_116_Print_Oddnumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }

    }
}
//Odd -> 1
//Odd -> 3
//Odd -> 5
//Odd -> 7
//Odd -> 9
//Odd -> 11
//Odd -> 13
//Odd -> 15
//Odd -> 17
//Odd -> 19
//Odd -> 21
//Odd -> 23
//Odd -> 25
//Odd -> 27
//Odd -> 29
//Odd -> 31
//Odd -> 33
//Odd -> 35
//Odd -> 37
//Odd -> 39
//Odd -> 41
//Odd -> 43
//Odd -> 45
//Odd -> 47
//Odd -> 49
//
//Process finished with exit code 0
