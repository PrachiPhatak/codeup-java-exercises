package GroceryList;

import grades.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final HashMap<Item, Integer> shoppingCart = new HashMap<>();
    private Item item;
    private int quantity;

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public HashMap<Item, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public boolean setItem(String category, String name) {
        item = new Item();
        if(item.setCategory(category)){
            this.item.setName(name);
            return true;
        }else{
            return false;
        }
    }

    public void addItemToShoppingCart(String category, String name, int quantity){
        if(setItem(category, name)){
            shoppingCart.put(item, quantity);
            System.out.println("Item added to cart successfully!");
        }else{
            System.out.println("Invalid category!");
        }
    }

    public void printShoppingCart(){
        for (Map.Entry<Item, Integer> shoppingCartItem : shoppingCart.entrySet()) {
            item = (Item) shoppingCartItem.getKey();
            System.out.println(item.getCategory()+","+item.getName()+","+ shoppingCartItem.getValue());
        }
    }

    public String getCategories(){
        String categoriesAsString = "| ";
         for(String category: item.getCATGORIES()){
             categoriesAsString = category + " |";
        }
        return categoriesAsString;
    }

}
