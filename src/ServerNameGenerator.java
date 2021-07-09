public class ServerNameGenerator {
    static String adj[] = {"kind", "charming", "cruel", "fantastic", "gentle", "huge", "perfect", "rough", "sharp", "tasty"};
    static String nouns[] = {"girl", "boy", "instructor", "students", "veteran", "car", "truck", "husband", "wife", "children"};
    public static String getRandomElement(String[] array){
        int random = (int)Math.floor(Math.random()*10);
        return array[random];
    }
    public static void main(String[] args) {
        String noun = getRandomElement(nouns);
        String adjective = getRandomElement(adj);
        System.out.println("Here is your server name: \n" + noun + "-" + adjective);
    }
}
