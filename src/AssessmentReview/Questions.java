package AssessmentReview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Questions {

    //https://github.com/CodeupClassroom/Oberon-Java-Asessment-Prep-Day2

    public static int[] ascending(int[] arr){
        return Arrays.stream(arr).sorted().toArray();
    }

    public static int countWords(String str){
        return str.split(" ").length;
    }

    public static int calculator(String op, int num1, int num2){
        switch (op){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static String cardHidden(String cardNumber){
        StringBuilder builder = new StringBuilder(cardNumber);
        return builder.replace(0, cardNumber.length()-4,"*").toString();
    }

    public static void reverseOddStrings(String str){
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            if(s.length() % 2 != 0){
                StringBuilder builder = new StringBuilder(s);
                System.out.println(builder.reverse());
            }
            System.out.println(s);
        }
    }
}
