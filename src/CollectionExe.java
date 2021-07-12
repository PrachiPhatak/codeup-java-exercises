import java.util.*;
import java.util.stream.Stream;

public class CollectionExe {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Ajit");
        map.put(101,"Shreya");
        map.put(102,"Prachi");
        map.put(103,"Aarya");

        //sortByKey(map);
        //sortByValue(map);
        //print(map);
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }

    private static void print(Stream<Map.Entry<Integer, String>> map) {
        //map.forEach(entry);
    }

    private static Stream<Map.Entry<Integer, String>> sortByValue(Map<Integer, String> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue());

    }

    private static void sortByKey(Map<Integer, String> map) {
    }
}
