package week07.Task3;

import java.util.Arrays;

public class Array_SortDescending_Viktoriya {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,7, 8, 90};
        sortDescending(arr);
        System.out.println("Array elements after sorting:" + (Arrays.toString(arr)));
    }

    public static int[] sortDescending(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for( int j = arr.length-1; j >= 0; j--) {
                int tmp = 0;
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}


