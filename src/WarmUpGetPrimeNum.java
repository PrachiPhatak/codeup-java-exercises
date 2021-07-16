import java.util.ArrayList;
import java.util.List;

public class WarmUpGetPrimeNum {

    public static void main(String[] args) {
        getPrimes(20);
    }

    private static void getPrimes(int howMany) {

        List<Integer> primeList = new ArrayList<Integer>();
        primeList.add(1);
        primeList.add(2);

        for (int j = 3; primeList.size() < howMany; j++) {
            if(isPrime(j)){
                primeList.add(j);
            }
        }

        System.out.println(primeList);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
