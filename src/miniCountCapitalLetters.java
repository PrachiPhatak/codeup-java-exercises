import java.util.Scanner;

public class miniCountCapitalLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = scanner.nextLine();
        System.out.println("The capital letters in the given string " + getNoOfCapitalLetters(str));
    }

    private static int getNoOfCapitalLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
