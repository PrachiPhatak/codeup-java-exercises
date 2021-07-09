import java.util.ArrayList;

public class collectionLecture {
    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>();

        stringArr.add("Casey");
        System.out.println(stringArr);
        System.out.println(stringArr.size());
        System.out.println(stringArr.hashCode());

        stringArr.add("Laura");
        System.out.println(stringArr);
        System.out.println(stringArr.size());
        System.out.println(stringArr.hashCode());

        stringArr.add("Jordy");
        System.out.println(stringArr);
        System.out.println(stringArr.size());
        System.out.println(stringArr.hashCode());

        stringArr.remove(2);
        System.out.println(stringArr);
        System.out.println(stringArr.size());
        System.out.println(stringArr.hashCode());

        System.out.println("Instructor at first "+ stringArr.get(0));
    }
}
