import java.util.Scanner;

public class ControlFLowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue;
        String userChoice = "";

        do {
            System.out.println("Enter an Integer number");
            intValue = scanner.nextInt();
            printTable(intValue);
            System.out.println("Number: " + intValue);
            System.out.println("Would you like to continue? (Yes/No)");
            userChoice = scanner.next();
        } while (!userChoice.equalsIgnoreCase("No"));
    }

    private static void printTable(int value) {
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed ");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= value; i++) {
            int numSq = i * i;
            int numCube = i * i * i;

            System.out.printf("%d      | %d      | %d    \n",
                    i,  numSq, numCube);
        }
    }
}
