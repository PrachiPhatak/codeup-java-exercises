public class WarmUpString {
    public static void main(String[] args) {
        int index = generateRandomNumber();
        String str = "Oberon is the best cohort";
        System.out.println(getCharFromGivenString(str, index));
    }

    private static int generateRandomNumber() {
        return (int) Math.floor(Math.random() * 50);
    }

    private static char getCharFromGivenString(String str, int index) {
        char c = '0';
        try {
            c = str.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Array out of bound!");
        }
        return c;
    }
}
