package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private String string;

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
