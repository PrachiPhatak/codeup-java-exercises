import java.util.Scanner;

public class ControlFLowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("Enter your grade (0-100): ");
            int grade = scanner.nextInt();
            System.out.println("Your grade is: ");
            if (60 > grade && grade > 0) {
                System.out.println('F');
            } else if (66 >= grade) {
                System.out.println('D');
            } else if (79 >= grade) {
                System.out.println('C');
            } else if (87 >= grade) {
                System.out.println('B');
            } else if (100 >= grade) {
                System.out.println('A');
            }
            System.out.println("Do you want to continue (Yes/No)?");
            userInput = scanner.next();
        } while (!userInput.equalsIgnoreCase("No"));
    }
}
