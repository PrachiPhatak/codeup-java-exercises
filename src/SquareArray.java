import java.util.*;

public class SquareArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{20,-11, 12, 31, 41, -5, 6, -7, 8, 9, 10};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(sortedSquaredArray(arr1)));
        System.out.println(Arrays.toString(sortedSquaredArray1(arr1)));

    }


    public static int[] sortedSquaredArray(int[] array) {
        int[] squareArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squareArray[i] = array[i] * array[i];
        }
        Arrays.sort(squareArray);
        return squareArray;
    }

    public static int[] sortedSquaredArray1(int[] array) {
        int[] squaredArray = new int[array.length];
        int start = 0;
        int end = array.length -1;

        for(int i = array.length -1; i >= 0; i--){
            System.out.println("Start: " + array[start] + " End " + array[end]);
            if(Math.abs(array[start]) > Math.abs(array[end])){
                squaredArray[i] = array[start] * array[start];
                start++;
            }else if(Math.abs(array[start]) < Math.abs(array[end])){
                squaredArray[i] = array[end] * array[end];
                end--;
            }else{
                squaredArray[i] = array[start] * array[start] ;
                start++;
            }

            if(start > end)
                break;
        }


        return squaredArray;
    }
}

