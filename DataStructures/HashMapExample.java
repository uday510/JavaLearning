package DataStructures;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {

        // Create a HashMap object called capitalCities

        // one way to create a HashMap
//        Map<String, String> capitalCities = new HashMap<String, String>();

        // easier way to create a HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // HashMap methods

        System.out.println("Accessing a value using a key: " + capitalCities.get("England"));
        System.out.println("Get all keys: " + capitalCities.keySet());
        System.out.println("Get all values: " + capitalCities.values());
        System.out.println("Get all key-value pairs: " + capitalCities.entrySet());
        System.out.println("Remove a key-value pair: " + capitalCities.remove("England"));
        System.out.println("Check if a key exists: " + capitalCities.containsKey("England"));
        System.out.println("Check if a value exists: " + capitalCities.containsValue("London"));
        System.out.println("Check if the HashMap is empty: " + capitalCities.isEmpty());
        System.out.println("Get the size of the HashMap: " + capitalCities.size());

        // Loop through the HashMap
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }

        // Clear the HashMap
        capitalCities.clear();
        System.out.println("Clear the HashMap: " + capitalCities);

        // Loop through the HashMap using Map.Entry
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // Loop through the HashMap using forEach
        capitalCities.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        // Loop through the HashMap using Map.keySet().forEach
        capitalCities.keySet().forEach(k -> System.out.println("Key: " + k + " Value: " + capitalCities.get(k)));

        // Loop through the HashMap using Map.values().forEach
        capitalCities.values().forEach(v -> System.out.println("Value: " + v));

        // Loop through the HashMap using Map.entrySet().forEach
        capitalCities.entrySet().forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

    }
}
