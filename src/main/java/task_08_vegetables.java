import java.util.HashMap;

public class task_08_vegetables {
    /**
     * "8. Create HashMap<String, String> and add 10 pairs:
     * watermelon, berry;
     * banana, fruit;
     * cherry, berry;
     * pineapple, fruit;
     * melon, vegetable;
     * cranberry, berry;
     * apple, fruit;
     * iris, flower;
     * potato, vegetable;
     * carrot, vegetable;
     * Print only vegetables to the console."
     * <p>
     * Do not use predefined keys to get vegetables.
     * You should use conditions to find vegetables.
     */
    public static void main(String[] args) {
        HashMap<String, String> fruitsMap = new HashMap<String, String>();
        String aValue;

        // fill the map with samples
        fruitsMap.put("watermelon", "berry");
        fruitsMap.put("banana", "fruit");
        fruitsMap.put("cherry", "berry");
        fruitsMap.put("pineapple", "fruit");
        fruitsMap.put("melon", "vegetable");
        fruitsMap.put("cranberry", "berry");
        fruitsMap.put("apple", "fruit");
        fruitsMap.put("iris", "flower");
        fruitsMap.put("potato", "vegetable");
        fruitsMap.put("carrot", "vegetable");

        System.out.println("\nPRINT VEGETABLES");
        for (String aKey : fruitsMap.keySet()) {
            aValue = fruitsMap.get(aKey);
            if (aValue == "vegetable") {
                System.out.println(aKey + " - " + aValue);
            }
        }
    }
}