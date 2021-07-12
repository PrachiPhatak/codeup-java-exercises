package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCRUDSF {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Prachi");
        map.put(100, "Casey");
        map.put(103, "Laura");
        map.put(104, "Dorian");
        map.put(105, "Tristan");
        map.put(102, "Jordy");
        print(map);

       // Set<Map.Entry<String>> values = map.entrySet();

    }

    private static void print(Map<Integer, String> map) {

        System.out.println(map);
    }


}
