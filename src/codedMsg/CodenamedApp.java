package codedMsg;

import java.util.*;

public class CodenamedApp {
    public static void main(String[] args) {
        int[] arr = {5,5,5,7};
        System.out.println("Yay! "+Solution.solution(arr));
    }
}



//package codedMsg;
//
//        import java.sql.Array;
//        import java.util.*;
//
//public class Solution {
//    public static int solution(int[] l) {
//        //Arrays.sort(l);
//        System.out.println("Given Array: " + Arrays.toString(l));
//        System.out.println(findLargestNumber(l));
//        return 0;
//    }
//
//    public static int findLargestNumber(int[] l) {
//        Map<Integer, ArrayList<Integer>> intToOccurrenceMap = new HashMap<>();
//        intToOccurrenceMap.put(0, new ArrayList<>());
//        intToOccurrenceMap.put(1, new ArrayList<>());
//        intToOccurrenceMap.put(2, new ArrayList<>());
//
//        for (int j : l) {
//            int reminder = j % 3;
//            intToOccurrenceMap.get(reminder).add(j);
//        }
//
//        System.out.println("Mapped " + intToOccurrenceMap);
//
//        ArrayList<Integer> finalArray = new ArrayList<>(intToOccurrenceMap.get(0));
//
//        ArrayList<Integer> finalRemainingArray1 = new ArrayList<>();
//        ArrayList<Integer> arrOfReminder1 = intToOccurrenceMap.get(1);
//        if (arrOfReminder1.size() % 3 == 0) {
//            finalArray.addAll(arrOfReminder1);
//        } else if (arrOfReminder1.size() % 3 == 1) {
//            finalArray.addAll(arrOfReminder1.subList(1, arrOfReminder1.size()));
//            finalRemainingArray1.addAll(arrOfReminder1.subList(0, 1));
//        } else {
//            finalArray.addAll(arrOfReminder1.subList(2, arrOfReminder1.size()));
//            finalRemainingArray1.addAll(arrOfReminder1.subList(0, 2));
//        }
//
//        ArrayList<Integer> finalRemainingArray2 = new ArrayList<>();
//        ArrayList<Integer> arrOfReminder2 = intToOccurrenceMap.get(2);
//        if (arrOfReminder2.size() % 3 == 0) {
//            finalArray.addAll(arrOfReminder2);
//        } else if (arrOfReminder2.size() % 3 == 1) {
//            finalArray.addAll(arrOfReminder2.subList(1, arrOfReminder2.size()));
//            finalRemainingArray2.addAll(arrOfReminder2.subList(0, 1));
//        } else {
//            finalArray.addAll(arrOfReminder2.subList(2, arrOfReminder2.size()));
//            finalRemainingArray2.addAll(arrOfReminder2.subList(0, 2));
//        }
//
//        if (finalRemainingArray1.size() == finalRemainingArray2.size()) {
//            finalArray.addAll(finalRemainingArray1);
//            finalArray.addAll(finalRemainingArray2);
//        }
//
//        if (finalRemainingArray1.size() < finalRemainingArray2.size()) {
//            finalArray.addAll(finalRemainingArray1);
//            if(finalRemainingArray2.size()> 1)
//                if (finalRemainingArray2.get(0) > finalRemainingArray2.get(1)) {
//                    System.out.println("1");
//                    finalArray.add(finalRemainingArray2.get(0));
//                } else if (finalRemainingArray2.get(0) < finalRemainingArray2.get(1)) {
//                    System.out.println(2);
//                    finalArray.add(finalRemainingArray2.get(1));
//                } else {
//                    System.out.println(3);
//                    finalArray.add(finalRemainingArray2.get(0));
//                }
//        }
//
//
//        Collections.sort(finalArray);
//        System.out.println("Largest Number: " + (finalArray));
//        int sum =0;
//        for (int i = 0; i < finalArray.size(); i++) {
//            sum = sum + (finalArray.get(i) * (int)Math.pow(10, i));
//        }
//        return  sum;
//    }
//
//
//}
