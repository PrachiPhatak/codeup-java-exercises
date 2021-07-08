package collection;

import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        System.out.println(Arrays.toString(getIntArray(5)));
    }

    public static int[] getIntArray(){
        return new int[]{1,2,3};
    }

    public static int[] getIntArray(int length){
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++){
            intArray[i] = i+1;
        }
        return intArray;
    }
}
