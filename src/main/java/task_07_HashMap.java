import java.util.HashMap;

public class task_07_HashMap {
    /**
     * "7. Create HashMap<String, String> and add 10 pairs:
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
     * <p>
     * Print the content of the map, each pair from a new line.
     * Example:
     * watermelon - berry;
     * cherry - berry;
     * ..."
     */
    public static void main(String[] args) {
        HashMap<String,String> fruitsMap = new HashMap<String, String>();

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

        System.out.println("\nPRINT NO sorting");
        for (String aKey: fruitsMap.keySet()) {
            System.out.println(aKey + " - " + fruitsMap.get(aKey));
        };

        System.out.println("\nSORTING by key");

    }
}
