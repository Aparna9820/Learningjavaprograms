package n_June_1st_Array_TASKS;

public class Lab_185_Task1_Array_in_Reverse_order {
    public static void main(String[] args) {
        String[] names={"Appu","Thiru", "Anu","Guna"};
        for(int i=names.length-1; i>=0; i--){
            System.out.print(names[i]+" ");
        }
    }
}
