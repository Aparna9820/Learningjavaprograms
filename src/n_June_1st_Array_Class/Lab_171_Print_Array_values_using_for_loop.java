package n_June_1st_Array_Class;

public record Lab_171_Print_Array_values_using_for_loop() {
    public static void main(String[] args) {
        String [] names={"Aparna", "Appu", "Thiru"};
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
