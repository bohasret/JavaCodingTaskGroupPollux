package javaCodingTasks.week07.Task3;

import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDescendingOrder(arr)));
    }
    
    public static int[] sortDescendingOrder(int[] arr) {
        int[] descendingOrder = arr;
        for (int i = 0; i < descendingOrder.length - 1; i++) {
            for (int j = i + 1; j < descendingOrder.length; j++) {
                if (descendingOrder[j] > descendingOrder[i]) {
                    int temp = descendingOrder[i];
                    descendingOrder[i] = descendingOrder[j];
                    descendingOrder[j] = temp;
                }
            }
        }
        return descendingOrder;
    }
}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};
 */