package collection;

import GroceryList.Item;
import GroceryList.ShoppingCart;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

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

        shoppingCart.printShoppingCart();

        //sortCartByCategory1(shoppingCart);

    }

    public void sortCartByCategory1(HashMap<Item, Integer> shoppingCart) {
        // Creating a list from elements of HashMap
        List<Map.Entry<Item, Integer> > list
                = new LinkedList<Map.Entry<Item, Integer> >(
                shoppingCart.entrySet());

        // Sorting the list using Collections.sort() method
        // using Comparator
        list.sort(new Comparator<Map.Entry<Item, Integer>>() {
            public int compare(
                    Map.Entry<Item, Integer> object1,
                    Map.Entry<Item, Integer> object2) {
                return (object1.getKey().getName())
                        .compareTo(object2.getKey().getName());
            }
        });

        // putting the  data from sorted list back to hashmap

        for (Map.Entry<Item, Integer> me : list) {
            System.out.println(me.getKey().getName());
        }


    }
}
