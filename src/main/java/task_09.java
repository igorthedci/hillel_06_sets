import java.util.ArrayList;

/**
 * "9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
 * Create HashSet<Integer> and add all unique numbers from the ArrayList."
 */

public class task_09 {

    public static void main(String[] args) {
        int range = 100;
        ArrayList<Integer> a100 = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            a100.add((int) (Math.random() * range));
        }
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.print(a100.get(i) + " ");
        }
    }
}