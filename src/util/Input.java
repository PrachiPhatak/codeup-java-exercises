package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() throws NumberFormatException{
        System.out.println("Enter a value: ");
        return scanner.nextLine();
    }

    public Integer getInteger(String userInput) {
        Integer i = 0;

        try {
            i = Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred "+ e.getMessage());
        }

        return i;
    }

    public Double getDouble(String userInput) {
        Double i = 0.0;

        try {
            i = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred "+ e.getMessage());
        }

        return i;
    }

}
