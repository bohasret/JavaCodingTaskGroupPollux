package week07.Task2;

import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7}; //{9, 10, 8, 7}
        System.out.println("sortAscendingOrder = " + Arrays.toString(sortAscendingOrder(arr)));
    }

    public static int[] sortAscendingOrder(int[] arr) {
        int[] ascendingOrder = arr;
        for (int i = 0; i < ascendingOrder.length - 1; i++) {
            for (int j = i + 1; j < ascendingOrder.length; j++) {
                if (ascendingOrder[j] < ascendingOrder[i]) {
                    int temp = ascendingOrder[i];
                    ascendingOrder[i] = ascendingOrder[j];
                    ascendingOrder[j] = temp;
                }
            }
        }
        return ascendingOrder;
    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */