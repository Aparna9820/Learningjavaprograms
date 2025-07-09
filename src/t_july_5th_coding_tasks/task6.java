package t_july_5th_coding_tasks;
// Generic Class for Pair
//Create a generic class `Pair` that holds two values of any type.
public class task6 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair);

        pair.setFirst("Height");
        pair.setSecond(175);
        System.out.println(pair);
    }
}
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter for first
    public T getFirst() {
        return first;
    }

    // Getter for second
    public U getSecond() {
        return second;
    }

    // Setter for first
    public void setFirst(T first) {
        this.first = first;
    }

    // Setter for second
    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }
}
//Pair [first=Age, second=30]
//Pair [first=Height, second=175]
//
//Process finished with exit code 0