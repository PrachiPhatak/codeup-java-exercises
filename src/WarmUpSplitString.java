import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpSplitString {

    public static void main(String[] args) throws Exception {


        printSplitString(spitString("Prachi Phatak Katy Texas Maharashtra India"));
        try{
            ArrayList<Integer> myArrList = new ArrayList<Integer>();
            System.out.println(myArrList.get(2));


        }catch (Exception e){
            System.out.println("Not a number");
        }


        try {
            int myNum = Integer.parseInt("eighteen");
        } catch (Exception e) {
            System.out.println("The input is not integer");
        }

        throw new Exception("Not a int");
    }

    public static void printSplitString(String[] stringArr) {
        for (String s : stringArr) {
            System.out.println(s);
        }
    }

    public static String[] spitString(String string) {
        return string.split(" ");
    }
}
