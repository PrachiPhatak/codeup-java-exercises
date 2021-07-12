package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapCRUDSF {
    public static void main(String[] args) {
  
        // Driver Code
        Map<String, Integer> map = new HashMap<>();
            // putting values in the Map
            map.put("Jayant", 80);
            map.put("Abhishek", 90);
            map.put("Anushka", 80);
            map.put("Amit", 75);
            map.put("Danish", 40);

            // Calling the function to sortbyKey
            sortByKey(map);

        }

    public static void sortByKey(Map<String, Integer> map )
        {
            ArrayList<String> sortedKeys
                    = new ArrayList<String>(map.keySet());

            Collections.sort(sortedKeys);

            // Display the TreeMap which is naturally sorted
            for (String x : sortedKeys)
                System.out.println("Key = " + x
                        + ", Value = " + map.get(x));
        }

}
