package GroceryList;

import java.util.Scanner;

public class Input {
    Scanner scanner;
    ShoppingCart shoppingCart;

    public Input(Scanner scanner, ShoppingCart shoppingCart) {
        this.scanner = scanner;
        this.shoppingCart = shoppingCart;
    }

    public void init() {
        System.out.println(
                "----------------------------- Welcome to FARM TO DOOR Groceries -----------------------------");

        showMainMenu();

        System.out.println(
                "---------------------------------------- Thank you ------------------------------------------");

    }

    public void showMainMenu() {
        System.out.println("Main Menu \n" +
                "0 - exit\n" +
                "1 - Would you like to create a grocery list?\n" +
                "\n" +
                "Enter your choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        switch (userChoice) {
            case 0:
                return;
            case 1:
                createGroceryList();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private void createGroceryList() {
        System.out.println("\nMake Grocery List\n" +
                "0 - exit\n" +
                "1 - Main menu\n" +
                "2 - Add new item\n" +
                "3 - Edit item\n" +
                "4 - Delete item\n" +
                "5 - View cart\n" +
                "6 - Sort list by category\n" +
                "7 - Make sample cart\n" +
                "\n" +
                "Enter your choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        switch (userChoice) {
            case 0:
                return;
            case 1:
                showMainMenu();
                break;
            case 2:
                addItem();
                createGroceryList();
                break;
            case 3:
                editItem();
                createGroceryList();
                break;
            case 4:
                deleteItem();
                createGroceryList();
                break;
            case 5:
                shoppingCart.printShoppingCart();
                createGroceryList();
                break;
            case 6:
                shoppingCart.sortCartByCategory();
                createGroceryList();
                break;
            case 7:
                createSampleCart();
                createGroceryList();
                break;
            default:
                System.out.println("Invalid choice");
                createGroceryList();
        }
    }

    private void deleteItem() {
        System.out.println("-------Delete item in the cart----------");
        System.out.println("Categories:  " + shoppingCart.getCategories());
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter item name: ");
        String name = scanner.nextLine();

        shoppingCart.deleteItem(name, category);
    }

    private void editItem() {
        System.out.println("-------Edit item quantity in the cart----------");
        System.out.println("Categories:  " + shoppingCart.getCategories());
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter item name: ");
        String name = scanner.nextLine();
        System.out.println("Add new Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        shoppingCart.editItem(name, category, quantity);
    }

    private void addItem() {
        System.out.println("-------Add item to the cart----------");
        System.out.println("Available Categories:  " + shoppingCart.getCategories());
        System.out.println("Choose category: ");
        String category = scanner.nextLine();
        System.out.println("Add item name: ");
        String name = scanner.nextLine();
        System.out.println("Add Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        shoppingCart.addItemToShoppingCart(category, name, quantity);

    }

    public void createSampleCart(){
        shoppingCart.addItemToShoppingCart("dairy","milk", 1);
        shoppingCart.addItemToShoppingCart("dairy","yogurt", 3);
        shoppingCart.addItemToShoppingCart("produce","Peas", 3);
        shoppingCart.addItemToShoppingCart("beverages","coconut water", 3);
        shoppingCart.addItemToShoppingCart("beverages","water", 5);
        shoppingCart.addItemToShoppingCart("beverages","juice", 2);
        shoppingCart.addItemToShoppingCart("produce","Spinach", 2);
        shoppingCart.addItemToShoppingCart("produce","Kale", 1);
        shoppingCart.addItemToShoppingCart("produce","Green beans", 1);
    }
}
