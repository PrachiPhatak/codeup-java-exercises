import movies.Movie;

import java.util.Arrays;

// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, print out all of their entries!

public class VacationSpot {
    static String[] vacationSpotArray = {"Bali", "Paris"};

    public String[] getVacationSpots() {
        return vacationSpotArray;
    }

    public void addVacationSpot(String spot) {
        String[] oldVacationSpotArray = vacationSpotArray;
        vacationSpotArray = Arrays.copyOf(oldVacationSpotArray, oldVacationSpotArray.length + 1);
        vacationSpotArray[oldVacationSpotArray.length] = spot;
        System.out.println(spot + " added successfully!");
    }

    public void printAllDestination() {
        System.out.println("******** All Destinations ********");
        for (String destination : vacationSpotArray) {
            System.out.println(" >>> " + destination);
        }
        System.out.println("**********************************");
    }
}
