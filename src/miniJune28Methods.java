//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.


//    TODO: create a new method that accepts the string created from the
//     first method and returns the number of characters in that string.

import java.util.Scanner;

public class miniJune28Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of a basketball team: ");
        String basketballTeam =  scanner.next();

        System.out.println(print(basketballTeam));
        System.out.println(len(print(basketballTeam)));

    }

    public static String print(String basketballTeam){
        return basketballTeam + " is the best team.";
    }

    public static String len(String basketballTeam){
        return "The length of given statement is " + basketballTeam.length();
    }

}
