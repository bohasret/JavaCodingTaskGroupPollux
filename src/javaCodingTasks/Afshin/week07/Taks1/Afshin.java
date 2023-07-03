package javaCodingTasks.Afshin.week07.Taks1;

public class Afshin {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6}; //--> 6
        int smallestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
            }
        }
        System.out.println(smallestNum);
    }
}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */