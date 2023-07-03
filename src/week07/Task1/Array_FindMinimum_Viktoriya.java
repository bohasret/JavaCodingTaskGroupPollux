package week07.Task1;

import java.util.Arrays;

public class Array_FindMinimum_Viktoriya {
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] arr = new int[]{99, 12, 23, 32, 44, 57, 6};
        System.out.println("findMinimum(arr) = " + findMinimum(arr));
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
