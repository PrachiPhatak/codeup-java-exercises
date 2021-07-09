import java.util.ArrayList;
import java.util.HashMap;

public class collectionLecture {
    public static void main(String[] args) {
        HashMap<Integer, String > myHashMap = new HashMap<>();
        for (int i = 0; i < 11; i++) {
            myHashMap.put(i, "User"+i);
        }
        System.out.println(myHashMap.containsValue("User3"));

    }
}
