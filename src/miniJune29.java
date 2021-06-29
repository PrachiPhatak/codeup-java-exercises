import java.util.Scanner;

//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.
public class miniJune29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name, age, Do you have pets?: ");
        String fact1 = scanner.next();
        String fact2 = scanner.next();
        String fact3 = scanner.next();

        System.out.println(getTheFact(fact1));
    }

    private static String getTheFact(String fact1) {
        return fact1;
    }

    private static String getTheFact(String fact1, String fact2, String fact3) {
        return fact1 + " " + fact2 + " " + fact3;
    }
}
