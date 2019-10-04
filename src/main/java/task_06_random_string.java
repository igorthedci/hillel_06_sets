import java.util.ArrayList;

public class task_06_random_string {
    /**
     * "6. Create ArrayList of Strings. Add 10 different Strings to it.
     * Using any cycle find the longest String in the list and print it out.
     * If there are several String with the same length - print each from a new line."
     * <p>
     * "1) Create ArrayList of String and initialize it.
     * 2) All values with the highest length should be printed out."
     */

    private static int MAX_LENGTH = 50;
    private static int MIN_LENGTH = 10;
    private static String charDICTIONARY;
    private static int sizeDICTIONARY;


    // generate random string
    public static String random_string() {

        int tmpLength = MIN_LENGTH + (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH));
        String result = "";
        for (int i = 0; i < tmpLength; i++) {
            result += charDICTIONARY.charAt((int) (Math.random() * sizeDICTIONARY));
        }
        return result;
    }

    public static void main(String[] args) {

        int strNumber = 20; // the number of stings
        ArrayList<String> arrStrings = new ArrayList<String>();
        int[] length = new int[strNumber];

        String tmpString = "";
        int tmpLength = 0;
        int maxLength = 0;

        // create the Char Dictionary to generate random strings
        charDICTIONARY = "    ";
        for (char c = 'a'; c <= 'z'; c++) {
            charDICTIONARY += c;
        }
        sizeDICTIONARY = charDICTIONARY.length();

        // generate random strings and print them
        System.out.println("Array of 10 random strings:");
        for (int i = 0; i < strNumber; i++) {
            tmpString = random_string();
            tmpLength = tmpString.length();
            System.out.println(i + "[" + tmpLength + "]: " + tmpString);
            arrStrings.add(tmpString);
            length[i] = tmpLength;
            maxLength = Math.max(maxLength, tmpLength);
        }

        // print strings with the max length
        System.out.println("\nMax string length is " + maxLength);
        for (int i = 0; i < strNumber; i++) {
            if (maxLength == length[i]) {
                System.out.println(i + "[" + maxLength + "]: " + arrStrings.get(i));

            }
        }
    }
}
