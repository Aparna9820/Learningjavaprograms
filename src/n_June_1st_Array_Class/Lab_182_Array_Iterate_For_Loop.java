package n_June_1st_Array_Class;

public class Lab_182_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 3, 4}, {4, 5,6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
//123
//234
//456
//
//Process finished with exit code 0