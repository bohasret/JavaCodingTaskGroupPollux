package week07.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zack {
    /*
    ======== Array_SortAscending =============
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 9, 8, 7};
            arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

     */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println("sortingArrayAsc_1(arr) = " + Arrays.toString( sortingArrayAsc_1(arr)));
    }


    /**
     * sorts an int array in Ascending order without using the sort() method of the Arrays class
     * @param a int array
     * @return int array
     */
    public static int[] sortingArrayAsc_1(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int each: a)
            list.add(each);

        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }

    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }


}
