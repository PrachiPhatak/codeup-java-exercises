package calc;

import java.util.Scanner;

public class Calculator {
    float num1 = 0;
    float num2 = 0;
    String operator;
    String userChoice ="";

    public Calculator() {
        initCalc();
    }

    public void initCalc(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter first number ");
            num1 = Float.parseFloat(scanner.next());

            System.out.println("Enter the operation ");
            operator = scanner.next();

            System.out.println("Enter second number ");
            num2 = Float.parseFloat(scanner.next());

            System.out.println(calculate());

            System.out.println("Do you wish to continue? (y/n)");
            userChoice = scanner.next();
        }while(!userChoice.equalsIgnoreCase("n"));
    }

    private float calculate() {

        switch(operator){
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

}
