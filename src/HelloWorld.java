import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
//        String userInput = "";
//        do {
//            System.out.println("Enter user name: ");
//            Scanner scanner = new Scanner(System.in);
//            String userName = scanner.next();
//
//            switch (userName) {
//                case "Casey":
//                case "Laura":
//                case "Dorian":
//                case "Tristan":
//                    System.out.println("User Exists!");
//                    break;
//                default:
//                    System.out.println("User Created Successfully!");
//            }
//
//            System.out.println("Do you want to continue? (y/n)");
//            userInput = scanner.next();
//        } while (!userInput.equals("n"));

        int i = 2;
        do {
            System.out.println(i);
            if(i==0){
            System.out.println(i);
                break;
            }
            i+=i;
        } while (i < 1000000000);
    }
}