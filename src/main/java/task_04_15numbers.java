import java.util.Arrays;

public class task_04_15numbers {
    /**
     * Create an array of 15 random integers from the segment [0;   9].
     * Display the array on the screen.
     * Count how many in the array of even elements
     * and display this number on the screen on a separate line.
     */
    public static void main(String[] args) {
        int range = 9;
        int[] arr15 = new int[15];

        // fill arr15 with 15 random numbers
        for (int i = 1; i < 15; i++) {
            arr15[i] = (int) (Math.random() * range);
        }
        // print the array
        System.out.println("Array of 15 random numbers:");
        System.out.println(Arrays.toString(arr15));

        // count even numbers
        int count = 0;
        for (int i : arr15) {
            if (i % 2 == 1) {
                count++;
            }
        }
        System.out.println("The number of even number is " + count);
    }
}
