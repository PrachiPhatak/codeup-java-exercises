import java.util.Arrays;

public class Money {

    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        //[1, 1, 2, 3, 5, 7, 22]
        System.out.println(nonConstructableChange(coins));

    }

    public static int nonConstructableChange(int[] coins) {
        Arrays.sort(coins);
        System.out.println(Arrays.toString(coins));
        for (int i = coins[0]; i < coins[coins.length-1]; i++) {
            System.out.println(i);
        }
        return -1;
    }
}