import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //  MINI EXERCISE
        //  TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

        String user1 = "Casey";
        String user2 = "Dorian";
        String user3 = "Laura";
        String user4 = "Tristan";

        while (true) {
            System.out.println("Enter user name: ");
            Scanner scanner = new Scanner(System.in);
            String userName = scanner.next();

            if ((userName.equalsIgnoreCase(user1) || (userName.equalsIgnoreCase(user2)) ||
                    (userName.equalsIgnoreCase(user3) || (userName.equalsIgnoreCase(user4))))) {
                System.out.println("Sorry, username has already been used.");
            } else {
                System.out.println("User created successfully!");
                return;
            }

            System.out.println("Do you want to continue (y/n)");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("n"))
                return;
        }
    }
}