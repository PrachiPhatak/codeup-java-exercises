package GroceryList;

import java.util.Arrays;
import java.util.Comparator;


public class Item implements Comparator<Item> {
    private final String[] CATEGORIES = {"produce", "dairy", "beverages"};
    private String category;
    private String name;

    public String[] getCATEGORIES() {
        return CATEGORIES;
    }

    public String getCategory() {
        return category;
    }

    public boolean setCategory(String category) {
        if (validate(category)) {
            this.category = category;
            return true;
        } else {
            return false;
        }
    }

    private boolean validate(String category) {
        return Arrays.asList(getCATEGORIES()).contains(category.toLowerCase());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Item i1, Item i2) {
        return (i1.getCategory()+i1.getName()).compareToIgnoreCase((i2.getCategory()+i2.getName()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (category.equals(other.category)) {
            return name.equals(other.name);
        } else {
            return false;
        }
    }

    //@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public String toString(){
        return  addPadding(this.getCategory(),30) + addPadding(this.getName(),30);
    }

    private String addPadding(String word, int newLength) {
        String paddedWord = "";
        if (word.length() < newLength) {
            int length = newLength - word.length();
            paddedWord = word + " ".repeat(length);
        }
        return paddedWord;
    }
}
