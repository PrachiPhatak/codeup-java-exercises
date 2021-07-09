package GroceryList;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public void showMainMenu(Scanner scanner) {
        System.out.println("Would you like to create a grocery list? (y/n)");
        String createGroceryList = scanner.nextLine();
        if(createGroceryList.equalsIgnoreCase("y")){
            System.out.println("Would you like to enter a new item? (y/n)");
            String createNewItem = scanner.nextLine();
            if(createNewItem.equalsIgnoreCase("y")){
                System.out.println(
                        "Select the category - Beverages, Dairy, Produce\n" +
                        "Enter the name of the item.\n" +
                        "Enter how many of the item.\n");
                //String createNewItem = scanner.nextLine();
            }
        }
    }
}
