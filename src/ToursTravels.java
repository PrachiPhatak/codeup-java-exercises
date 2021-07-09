import movies.Input;
import movies.Movie;
import movies.MovieArray;

import java.util.Arrays;
import java.util.Scanner;

public class ToursTravels {
    public static void main(String[] args) {
        showOptions();
    }

    private static void showOptions() {
        String userInput ="";
        Scanner scanner = new Scanner(System.in);
        VacationSpot locations = new VacationSpot();
        locations.printAllDestination();
        do{
            System.out.println("Enter your favorite destination: ");
            String newDestination = scanner.nextLine();
            locations.addVacationSpot(newDestination);
            locations.printAllDestination();
            System.out.println("Do you want to add more destinations? (y/n)");
            userInput = scanner.nextLine();
        }while(!userInput.equalsIgnoreCase("n"));

    }
}
