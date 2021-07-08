package calc;

import java.util.Scanner;

public class Input {
    float num1 = 0;
    float num2 = 0;
    String operator;
    String userChoice = "";

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        setNum1(Float.parseFloat(scanner.next()));

        System.out.println("Enter the operation ");
        setOperator(validateOpt(scanner.next()));

        System.out.println("Enter second number ");
        setNum2(Float.parseFloat(scanner.next()));
    }

    private String validateOpt(String op) {
        if ("+-*/".indexOf(op) > 0) {
            System.out.println("");
        }
        return "";
    }
}
