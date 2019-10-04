import java.util.ArrayList;

public class task_05_ArrayList_String {
    /**
     * "5. Create ArrayList of Strings. Add 5 different Strings to it.
     * Using any cycle print all the values of the ArrayList to the console."
     * <p>
     * "1) Create ArrayList of String and initialize it.
     * 2) The size of the ArrayList should be printed to the console.
     * 3) All values should be printed to the console (each from a new line)"
     */
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        // add five strings
        stringList.add("Add");
        stringList.add("5");
        stringList.add("different");
        stringList.add("strings");
        stringList.add("");

        // print stringList
        int len = stringList.size();
        System.out.println("ArrayList of Strings contains " + len + " elements");
        for(int i = 0; i < len; i++) {
            System.out.println("" + i + ": " + stringList.get(i));
        }
    }
}
