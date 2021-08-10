package codedMsg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Solution {
    public static int solution(int[] l) {
        Map<Integer, ArrayList<Integer>> intToOccurrenceMap = new HashMap<>();
        intToOccurrenceMap.put(0, new ArrayList<>());
        intToOccurrenceMap.put(1, new ArrayList<>());
        intToOccurrenceMap.put(2, new ArrayList<>());

        for (int j : l) {
            int reminder = Math.abs(j % 3);
            intToOccurrenceMap.get(reminder).add(j);
        }

        System.out.println(intToOccurrenceMap);

        ArrayList<Integer> finalArray = new ArrayList<>(intToOccurrenceMap.get(0));

        ArrayList<Integer> finalRemainingArray1 = new ArrayList<>();
        ArrayList<Integer> arrOfReminder1 = intToOccurrenceMap.get(1);
        divideArray(finalArray, finalRemainingArray1, arrOfReminder1);

        ArrayList<Integer> finalRemainingArray2 = new ArrayList<>();
        ArrayList<Integer> arrOfReminder2 = intToOccurrenceMap.get(2);
        divideArray(finalArray, finalRemainingArray2, arrOfReminder2);

        if (finalRemainingArray1.size() != 0 && finalRemainingArray2.size() != 0)
            if (finalRemainingArray1.size() == finalRemainingArray2.size()) {
                finalArray.addAll(finalRemainingArray1);
                finalArray.addAll(finalRemainingArray2);
            } else if (finalRemainingArray1.size() < finalRemainingArray2.size()) {
                remainingNumbers(finalArray, finalRemainingArray1, finalRemainingArray2);
            } else {
                remainingNumbers(finalArray, finalRemainingArray2, finalRemainingArray1);
            }
        System.out.println(finalArray);
        Collections.sort(finalArray);
        int sum = 0;
        for (int i = 0; i < finalArray.size(); i++) {
            sum = sum + (finalArray.get(i) * (int) Math.pow(10, i));
        }
        return Math.max(sum, 0);

    }

    private static void remainingNumbers(ArrayList<Integer> finalArray, ArrayList<Integer> finalRemainingArray1, ArrayList<Integer> finalRemainingArray2) {
        if(finalRemainingArray1.size()>1){
            finalArray.add(Math.max(finalRemainingArray1.get(0),finalRemainingArray1.get(1)));
            finalArray.addAll(finalRemainingArray2);
        }

        if(finalRemainingArray2.size() >1){
            finalArray.add(Math.max(finalRemainingArray2.get(0), finalRemainingArray2.get(1)));
            finalArray.addAll(finalRemainingArray1);
        }


    }

    private static void divideArray(ArrayList<Integer> finalArray, ArrayList<Integer> finalRemainingArray1, ArrayList<Integer> arrOfReminder1) {
        Collections.sort(arrOfReminder1);
        if (arrOfReminder1.size() % 3 == 0) {
            finalArray.addAll(arrOfReminder1);
        } else if (arrOfReminder1.size() % 3 == 1) {
            finalArray.addAll(arrOfReminder1.subList(1, arrOfReminder1.size()));
            finalRemainingArray1.addAll(arrOfReminder1.subList(0, 1));
        } else {
            finalArray.addAll(arrOfReminder1.subList(2, arrOfReminder1.size()));
            finalRemainingArray1.addAll(arrOfReminder1.subList(0, 2));
        }
    }

}
