package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
     private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStringArray()));
    }

    public static String[] getStringArray(){
        System.out.println("Enter your name: ");
        return  scanner.nextLine().split(" ");
    }

    public static String[] getStringArray(int length){
        return new String[length];
    }
}
