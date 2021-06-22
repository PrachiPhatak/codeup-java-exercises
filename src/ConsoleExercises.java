import java.util.Date;
import java.util.Scanner;

/* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName =  input.next();

        System.out.println("Enter your birthday month: ");
        String birthday =  input.next();


        System.out.printf("%s's birthday is in %s", firstName,birthday);

    }
}
