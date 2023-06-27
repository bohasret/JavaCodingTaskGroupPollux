package javaCodingTasks.Afshin.week06.Task2;

public class Afshin {
    public static void main(String[] args) {
        int[] numbers = {10,50,24,11,85, 99, 78};
        int maxNumber = -2147483648;

        for (int each : numbers){
            if(each >= maxNumber){
                maxNumber = each;
            }
        }
        System.out.println("maxNumber = " + maxNumber);
    }

}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */