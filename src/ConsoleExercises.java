import java.util.Date;
import java.util.Scanner;

/* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your length: ");
        int length = Integer.parseInt(input.next());

        System.out.println("Enter your width: ");
        int width =  input.nextInt();

        System.out.println("Area of given rectangle: " + (length * width));
        System.out.println("Perimeter of given rectangle: " + (2 * length * width));
    }
}
