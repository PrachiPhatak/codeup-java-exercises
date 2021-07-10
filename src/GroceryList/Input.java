package GroceryList;

import java.util.Scanner;

public class Input {
    Scanner scanner;
    ShoppingCart shoppingCart;

    public Input(Scanner scanner, ShoppingCart shoppingCart) {
        this.scanner = scanner;
        this.shoppingCart = shoppingCart;
    }

    public void init(){
        System.out.println(
                "----------------------------- Welcome to FARM TO DOOR Groceries -----------------------------");

        showMainMenu();

        System.out.println(
                "---------------------------------------- Thank you ------------------------------------------");

    }

    public void showMainMenu() {
        System.out.println("Would you like to create a grocery list? (y/n)");
        String createGroceryList = scanner.nextLine();
        if(createGroceryList.equalsIgnoreCase("y")){
            createGroceryList();
        }else if(!createGroceryList.equalsIgnoreCase("n")){
            System.out.println("Invalid choice");
        }
    }

    private void createGroceryList() {
        System.out.println("Would you like to enter a new item? (y/n)");
        String createNewItem = scanner.nextLine();
        if(createNewItem.equalsIgnoreCase("y")){
            addItem();
        }else{
            showMainMenu();
        }
    }

    private void addItem() {
        System.out.println("Enter category");
        System.out.println("s");
    }
}
