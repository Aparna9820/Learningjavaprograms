package n_June_28th_tasks;
//StringBuilder vs StringBuffer Performance
//Write a program that demonstrates the performance difference between String concatenation, StringBuilder, and StringBuffer for multiple string operations.
public class task3 {
    public static void main(String[] args) {
        int iterations = 100000;

        // 1. Using String concatenation
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String (+) Time: " + (endTime - startTime) + " ms");

        // 2. Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");

        // 3. Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");
    }
}
//String (+) Time: 1295 ms
//StringBuilder Time: 3 ms
//StringBuffer Time: 7 ms
//
//Process finished with exit code 0