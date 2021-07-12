import java.util.Date;
import java.util.Scanner;

/* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Enter your length, width, height: ");

        float length = Float.parseFloat(scanner.next());
        float height = Float.parseFloat(scanner.next());
        float width = Float.parseFloat(scanner.next());

        System.out.printf("For give length: %f, width: %f, height: %f \n", height, width, height);
        System.out.println("Area of given rectangle: " + (length * width));
        System.out.println("Perimeter of given rectangle: " + (2 * (length + width)));
        System.out.println("Volume of the room: "+ (width * height * length));



    }


}
