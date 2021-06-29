//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";

import java.util.Scanner;

public class miniJune28Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = scanner.next();

        System.out.println("Enter your Last Name: ");
        String lastName = scanner.next();

        System.out.println(printFullName(firstName, lastName));
        System.out.println(printFullName(firstName));
    }

    public static String printFullName(String firstName, String lastName){
        return "Hello "+firstName +" "+lastName;
    }

    public static String printFullName(String firstName){
        return "Hello "+firstName ;
    }
}
