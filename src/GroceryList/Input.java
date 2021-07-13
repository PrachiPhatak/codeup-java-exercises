package GroceryList;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static void init() {
        System.out.println(
                "----------------------------- Welcome to FARM TO DOOR Groceries -----------------------------");

        showMainMenu();

        System.out.println(
                "---------------------------------------- Thank you ------------------------------------------");

    }

    public static void showMainMenu() {
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
                createGroceryList(new ShoppingCart());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void createGroceryList(ShoppingCart shoppingCart){
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
                addItem(shoppingCart);
                createGroceryList(shoppingCart);
                break;
            case 3:
                editItem(shoppingCart);
                createGroceryList(shoppingCart);
                break;
            case 4:
                deleteItem(shoppingCart);
                createGroceryList(shoppingCart);
                break;
            case 5:
                shoppingCart.printShoppingCart();
                createGroceryList(shoppingCart);
                break;
            case 6:
                shoppingCart.sortCartByCategory();
                createGroceryList(shoppingCart);
                break;
            case 7:
                createSampleCart(shoppingCart);
                createGroceryList(shoppingCart);
                break;
            default:
                System.out.println("Invalid choice");
                createGroceryList(shoppingCart);
        }
    }

    private static void deleteItem(ShoppingCart shoppingCart) {
        System.out.println("-------Delete item in the cart----------");
        System.out.println("Categories:  " + shoppingCart.getCategories());
        System.out.println("Enter category: ");
        String category = scanner.nextLine();
        System.out.println("Enter item name: ");
        String name = scanner.nextLine();

        shoppingCart.deleteItem(name, category);
    }

    private static void editItem(ShoppingCart shoppingCart) {
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

    private static void addItem(ShoppingCart shoppingCart) {
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

    public static void createSampleCart(ShoppingCart shoppingCart) {
        shoppingCart.addItemToShoppingCart("dairy", "milk", 1);
        shoppingCart.addItemToShoppingCart("dairy", "yogurt", 3);
        shoppingCart.addItemToShoppingCart("produce", "Peas", 3);
        shoppingCart.addItemToShoppingCart("beverages", "coconut water", 3);
        shoppingCart.addItemToShoppingCart("beverages", "water", 5);
        shoppingCart.addItemToShoppingCart("beverages", "juice", 2);
        shoppingCart.addItemToShoppingCart("produce", "Spinach", 2);
        shoppingCart.addItemToShoppingCart("produce", "Kale", 1);
        shoppingCart.addItemToShoppingCart("produce", "Kale", 1);
        shoppingCart.addItemToShoppingCart("produce", "Green beans", 1);
        shoppingCart.addItemToShoppingCart("produce", "Green beans", 5);
    }
}
