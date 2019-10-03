import java.util.ArrayList;
import java.util.HashSet;

/**
 * "9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
 * Create HashSet<Integer> and add all unique numbers from the ArrayList."
 */

public class task_09 {

    public static void main(String[] args) {
        int range = 100;
        int item;
        ArrayList<Integer> a100 = new ArrayList<Integer>();
        HashSet<Integer> hs100 = new HashSet<Integer>();

        // fill ArrayList a100 and HashSet hs100 with 100 random numbers
        for (int i = 0; i < 100; i++) {
            item = (int) (Math.random() * range);
            a100.add(item);
            hs100.add(item);
        }
        // print ArrayList
        System.out.println("ArrayList:");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.printf("%4d", a100.get(i));
        }
        // print HashSet
        System.out.println("\nHashSet:");
        int i = 0;
        for (int hash : hs100) {
            System.out.printf("%4d", hash);
            if (++i % 10 == 0) System.out.println();
        }
    }
}