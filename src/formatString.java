import java.util.Arrays;

public class formatString {
    public static void main(String[] args) {
        System.out.print(wrapString("Tomato,onion,red pepper,spices", 10));
    }

    public static String wrapString(String instructions, int noOfCharPerLine){
        StringBuilder output = new StringBuilder();

        for(int i =0; i < instructions.length(); i+=noOfCharPerLine){
            int end = i + noOfCharPerLine;

            if(end > instructions.length() ){
                end = instructions.length();
            }

            output.append(instructions, i, end).append("\n");
        }
        return output.toString();
    }

    public static String wrapString1(String instructions, int noOfCharPerLine){
        String[] strArray = instructions.split(" ");

        int count = 0;
        for(int i =0; i < strArray.length; i++){

        }
        System.out.println(Arrays.toString(strArray));
        return "";
    }
}
