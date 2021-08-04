public class Solution {

    public static String solution(int i) {
        return getPrimes(i).substring(i, i + 5);
    }

    private static String getPrimes(int i) {
        StringBuilder primeNoAsString = new StringBuilder();

        for (int j = 2; primeNoAsString.length() < 10005; j++) {
            if (isPrime(j)) {
                primeNoAsString.append(j);
                if(primeNoAsString.length() >= i+5)
                    return primeNoAsString.toString();
            }
        }
        return primeNoAsString.toString();
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


//    There's some unrest in the minion ranks: minions with ID numbers like "1", "42", and other "good" numbers have been lording it over the poor minions who are stuck with more boring IDs. To quell the unrest, Commander Lambda has tasked you with reassigning everyone new random IDs based on a Completely Foolproof Scheme.
//    Commander Lambda has concatenated the prime numbers in a single long string: "2357111317192329...". Now every minion must draw a number from a hat. That number is the starting index in that string of primes, and the minion's new ID number will be the next five digits in the string. So if a minion draws "3", their ID number will be "71113".
//    Help the Commander assign these IDs by writing a function solution(n) which takes in the starting index n of Lambda's string of all primes, and returns the next five digits in the string. Commander Lambda has a lot of minions, so the value of n will always be between 0 and 10000.
//    Languages
//=========
//    To provide a Java solution, edit Solution.java
//    To provide a Python solution, edit solution.py
//    Test cases
//==========
//    Your code should pass the following test cases.
//    Note that it may also be run against hidden test cases not shown here.
//
//            -- Java cases --
//    Input:
//            Solution.solution(0)
//    Output:
//            23571
//
//    Input:
//            Solution.solution(3)
//    Output:
//            71113
//
//            -- Python cases --
//    Input:
//            solution.solution(0)
//    Output:
//            23571
//
//    Input:
//            solution.solution(3)
//    Output:
//            71113
//
//    Use verify [file] to test your solution and see how it does. When you are finished editing your code, use submit [file] to submit your answer. If your solution passes the test cases, it will be removed from your home folder.

//import java.util.ArrayList;
//        import java.util.List;
//
//public class Solution{
//    public static String solution(int i) {
//        String primeAsString = getPrimes(2289);
//        return primeAsString.substring(i, i + 5);
//    }
//    private static String getPrimes(int howMany) {
//        StringBuilder primeNoAsString = new StringBuilder();
//        List<Integer> primeList = new ArrayList<Integer>();
//        primeList.add(1);
//        primeList.add(2);
//
//        for (int j = 2; primeList.size() < howMany; j++) {
//            if (isPrime(j)) {
//                primeList.add(j);
//                primeNoAsString.append(j);
//            }
//        }
//        return primeNoAsString.toString();
//    }
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}