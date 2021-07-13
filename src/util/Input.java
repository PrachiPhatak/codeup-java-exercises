package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private String string;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public void getUserInput(){
        System.out.println("Enter a value: ");
        String string = scanner.nextLine();
        try {
            double doubleOutput = Double.parseDouble(string);
            System.out.println("Given input is double");
        }catch (Exception e) {
            System.out.println("Given input is not double");

        }

        try {
            int intOutput = Integer.parseInt(string);
            System.out.println("Given input is int");
        }catch (Exception e) {
            System.out.println("Given input is not int");

        }

        try {
            float intOutput = Float.parseFloat(string);
            System.out.println("Given input is float");
        }catch (Exception e) {
            System.out.println("Given input is not float");

        }

        try {
            byte byteOutput = Byte.parseByte(string);
        }catch (Exception e) {
            System.out.println("Given input is not byte");

        }

    }
    public String getString(){
        return string;
    }

    public boolean yesNo(String userInput){
        return userInput.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        return 0;
    }

    public double getDouble(double min, double max){
        return 0;
    }

    public double getDouble(){
        return 0;
    }

    public String prompt(){
        return "Enter ";
    }
}
