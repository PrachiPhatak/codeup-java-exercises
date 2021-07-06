package food;

import java.util.Scanner;

public class GroceryShop {

    public static void main(String[] args) {
        Fruit m1 = new Mango("Alphonso");
        Fruit m2 = new Mango("Yellow","Sweet",true,"Payari");

        System.out.println(m1.describe());
        System.out.println(m2.describe());
    }

}
