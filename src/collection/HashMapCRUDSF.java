package collection;

import GroceryList.Item;
import GroceryList.ShoppingCart;

import java.util.*;

public class HashMapCRUDSF {




    private String addPadding(String word, int newLength) {
        String paddedWord = "";
        if (word.length() < newLength) {
            int length = newLength - word.length();
            paddedWord = word + " ".repeat(length);
        }
        return paddedWord;
    }

}
