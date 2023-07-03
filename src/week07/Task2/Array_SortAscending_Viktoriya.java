package week07.Task2;

import java.util.Arrays;

public class Array_SortAscending_Viktoriya {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7};
        sortAscending(arr);
        System.out.println("Array elements after sorting:" + (Arrays.toString(arr)));
    }

    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}







