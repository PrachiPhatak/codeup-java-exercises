import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 10));
//        System.out.println(multiplication(5, 10));
//        System.out.println(division(5, 10));
//        //if divided by zero, it throws Exception
//        System.out.println(modulus(5, 10));
//        multiplicationTable(12);
        int num = getInteger(10, 100);
        System.out.printf("Factorial %d is %d.", num, getFactorial(num));
    }

    public static long getFactorial(int num) {
        if (num >= 1)
            return num * getFactorial(num - 1);
        else
            return 1;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return b - a;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void multiplicationTable(int a) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + a;
            System.out.println(total);
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        int userInput;
        do {
            System.out.printf("Enter int between %d-%d", min, max);
            userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                break;
            } else {
                System.out.println("Not in Range");
            }
            System.out.println("Do you want to continue? (y/n)");
            userChoice = scanner.next();
        } while (!userChoice.equalsIgnoreCase("n"));
        return userInput;
    }
}
