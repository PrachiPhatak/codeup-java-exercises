package GroceryList;

import java.util.*;

public class ShoppingCart {
    private final HashMap<Item, Integer> shoppingCart;
    private Item item;

    public ShoppingCart() {
        this.item = new Item();
        shoppingCart = new HashMap<>();
    }

    public boolean setItem(String category, String name) {
        item = new Item();
        if (item.setCategory(category)) {
            this.item.setName(name);
            return true;
        } else {
            return false;
        }
    }

    public void addItemToShoppingCart(String category, String name, int quantity) {
        if (setItem(category, name)) {
            if (!shoppingCart.containsKey(item)) {
                shoppingCart.put(item, quantity);
                System.out.println("Item added to cart successfully!");
            } else {
                System.out.println("Item is already in the cart");
            }

        } else {
            System.out.println("Invalid category!");
        }
    }

    public void printShoppingCart() {
        if (shoppingCart.isEmpty()) {
            System.out.println("No items added to the cart");
            return;
        }
        for (Map.Entry<Item, Integer> shoppingCartItem : shoppingCart.entrySet()) {
            item = shoppingCartItem.getKey();
            System.out.println(addPadding(item.getCategory(), 20) +
                    addPadding(item.getName(), 20) +
                    addPadding(shoppingCartItem.getValue() + "", 20)
            );
        }
    }

    public String getCategories() {
        StringBuilder categoriesAsString = new StringBuilder("| ");
        for (String category : item.getCATEGORIES()) {
            categoriesAsString.append(category).append(" | ");
        }
        return categoriesAsString.toString();
    }

    public void sortCartByCategory() {
        if (shoppingCart.isEmpty()) {
            System.out.println("No items added to the cart");
            return;
        }

        TreeMap<Item, Integer> treeMapShoppingCart =
                new TreeMap<>(new Item());

        treeMapShoppingCart.putAll(shoppingCart);

        Set<Map.Entry<Item, Integer>> entries = treeMapShoppingCart.entrySet();

        System.out.println(addPadding("Category", 30) +
                addPadding("Items", 30) +
                addPadding("Quantity", 30) + "\n");
        for (Map.Entry<Item, Integer> entry : entries) {
            System.out.println(entry.getKey() + addPadding(entry.getValue() + "", 30));
        }

    }

    private String addPadding(String word, int newLength) {
        String paddedWord = "";
        if (word.length() < newLength) {
            int length = newLength - word.length();
            paddedWord = word + " ".repeat(length);
        }
        return paddedWord;
    }

    public void editItem(String name, String category, int quantity) {

        if (shoppingCart.isEmpty()) {
            System.out.println("No items added to the cart");
            return;
        }
        Item editItem = new Item();
        if (editItem.setCategory(category)) {
            editItem.setName(name);
            if (!shoppingCart.containsKey(editItem)) {
                System.out.println("Item not found in the cart");

            } else {
                shoppingCart.remove(editItem);
                shoppingCart.put(editItem, quantity);
                System.out.println("Updated item added to cart successfully!");
            }

        } else {
            System.out.println("Invalid category!");
        }


    }

    public void deleteItem(String name, String category) {
        if (shoppingCart.isEmpty()) {
            System.out.println("No items added to the cart");
            return;
        }
        Item editItem = new Item();
        if (editItem.setCategory(category)) {
            editItem.setName(name);
            if (!shoppingCart.containsKey(editItem)) {
                System.out.println("Item not found in the cart");

            } else {
                shoppingCart.remove(editItem);
                System.out.println("Deleted item from the cart successfully!");
            }

        } else {
            System.out.println("Invalid category!");
        }
    }

    //ValidateItem(Item item)
}
