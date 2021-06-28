import java.util.Scanner;

public class miniJune28 {
    //        TODO: create a String variable that holds this sentence: "Red
    //         Orange Blue Yellow Green Purple". Prompt the user to type in
    //         their favorite color, if their fave color is the same as the
    //         first word in the String, then print out "my fave color:
    //         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"

    public static void main(String[] args) {
        String colors = "Red Orange Blue Yellow Green Purple";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite color: ");
        String userColor = scanner.next();
        if(colors.startsWith(userColor)){
            System.out.printf("my fave color: %s is the first one", userColor);
        }else if(colors.endsWith(userColor)){
            System.out.printf("my fave color: %s is the last one", userColor);
        }else{
            System.out.println("N/A");
        }
    }
}
