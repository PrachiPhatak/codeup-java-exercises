package GroceryList;

import java.util.Scanner;

public class FarmToDoorGroceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        Input input = new Input(scanner, shoppingCart);
        input.init();
    }
}
