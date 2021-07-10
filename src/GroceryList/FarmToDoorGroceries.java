package GroceryList;

import java.util.Scanner;

public class FarmToDoorGroceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        Input input = new Input(scanner, shoppingCart);


        shoppingCart.addItemToShoppingCart("produce","milk", 2);
        shoppingCart.addItemToShoppingCart("produce1","milk", 2);
        shoppingCart.addItemToShoppingCart("produce","milk", 2);

        shoppingCart.printShoppingCart();
    }
}
