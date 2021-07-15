import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoDiLaura {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        if (checkIfEnoughBalance(scanner) && checkIfOlderThan16(scanner))
            System.out.println("Congratulations! You are eligible to open the account.");
        else
            System.out.println("Thank you for visiting!");
    }

    private static boolean checkIfOlderThan16(Scanner scanner) {
        try {
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 16)
                throw new MyException("You need to be older than 16 to open the account.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Invalid age");
            return false;
        }
        return true;
    }

    private static boolean checkIfEnoughBalance(Scanner scanner) {
        try {
            System.out.println("Enter your balance: ");
            double balance = Double.parseDouble(scanner.nextLine());
            if (balance < 200) {
                throw new MyException("You need at least $200 to open the account.");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Invalid balance.");
            return false;
        }
        return true;
    }
}

class MyException extends Exception {
    String message;

    public MyException(String str) {
        this.message = str;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}