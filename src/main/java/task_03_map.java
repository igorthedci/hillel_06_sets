import java.util.HashMap;
import java.util.Map;

/**
 * 3. Create Map vehicles : vehicles.put("BMW", 5);, print
 */
public class task_03_map {
    public static void main(String[] args) {

        HashMap<String, Integer> vehicles = new HashMap<String, Integer>();
        vehicles.put("BMW", 1913);
        vehicles.put("Suzuki", 1939);
        vehicles.put("ZAZ", 1960);

        System.out.println("\nVehicles");
        System.out.println(vehicles);

        HashMap<Integer, String> mapWeek = new HashMap<Integer, String>(); // Map mapWeek = new HashMap();

        mapWeek.put(1, "Monday");
        mapWeek.put(3, "Wednesday");
        mapWeek.put(5, "Friday");
        mapWeek.put(6, "Saturday");
        mapWeek.put(7, "Monday");
        mapWeek.put(7, "Sunday");

        System.out.println("\nPrint mapWeek");
        System.out.println(mapWeek);

        System.out.println("\nPrint with FOREACH loop");
        for (int item: mapWeek.keySet()) {
            System.out.println(item + ": " + mapWeek.get(item));
        }

        System.out.println("\nPrint with entrySet method");
        System.out.println(mapWeek.entrySet());

//        for(Map item: mapWeek.entrySet()) {
//
//        }


    }
}
