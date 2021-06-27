import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //TODO: using previous mini exercise,
        // allow the user to input a new username several times
        // until a unique username is entered.

        System.out.println("You said - ");
        Scanner scanner = new Scanner(System.in);
        String que = scanner.nextLine();
        if(que.endsWith("?")){
            System.out.println("Bob says: Sure");
        }else if(que.endsWith("!")){
            System.out.println("Bob says: Whoa, chill out!");
        }else if(que.isEmpty()){
            System.out.println("Bob says: Fine. Be that way");
        }
        else{
            System.out.println("Bob says: Whatever");
        }

    }
}