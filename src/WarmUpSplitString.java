import java.util.Arrays;

public class WarmUpSplitString {

    public static void main(String[] args) {

        for (String s : spitString("Prachi Phatak Katy Texas Maharashtra India")) {
            System.out.println(s);
        }
    }

    public static String[] spitString(String string){
        return string.split(" ");
    }
}
