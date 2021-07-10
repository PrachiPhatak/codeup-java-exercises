package GroceryList;

import java.util.Arrays;
import java.util.Locale;

public class Item {
    private final String[]  CATGORIES = {"produce", "dairy", "beverages", "frozen foods"};
    private String category;
    private String name;

    public String[] getCATGORIES() {
        return CATGORIES;
    }

    public String getCategory() {
        return category;
    }

    public boolean setCategory(String category) {
        if(validate(category)){
            this.category = category;
            return true;
        }else{
            return false;
        }
    }

    private boolean validate(String category) {
        return Arrays.asList(getCATGORIES()).contains(category.toLowerCase());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
