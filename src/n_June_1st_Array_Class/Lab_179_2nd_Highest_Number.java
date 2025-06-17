package n_June_1st_Array_Class;

public class Lab_179_2nd_Highest_Number {
    public static void main(String[] args) {
        int [] numbers= {23,45,67,78,90,55};
        int highest_num=0;
        int second_highest_num=0;

        //enhanced for loop
        for(int num: numbers){
            if(num>highest_num){
                second_highest_num=highest_num;
                highest_num=num;
            }else if(num > second_highest_num && num!=highest_num){
                second_highest_num=num;
            }
        }
        System.out.println(second_highest_num);

    }
}
//normal for loop
//for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > highest_num) {
//                second_highest_num = highest_num;
//                highest_num = numbers[i];
//            } else if (numbers[i] > second_highest_num && numbers[i] != highest_num) {
//                second_highest_num = numbers[i];
//            }
//        }