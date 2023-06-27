package javaCodingTasks.Afshin.week06.Task3;

public class Afshin {
    public static void main(String[] args) {
        String sumThis = "I have 4 legs, then 2 legs then 3 legs to stand on, what am I?";
        System.out.println("The sum of numbers in this string are: " + returnSum(sumThis));
    }
    public static int returnSum(String sumThis){
        int sum = 0;
        String[] sumThisArray = sumThis.split(" ");
        for(String each : sumThisArray){
            if(each.contains("0")||each.contains("1")||each.contains("2")||each.contains("3")||each.contains("4")||each.contains("5")||each.contains("6")||each.contains("7")||each.contains("8")||each.contains("9")){
                sum += Integer.parseInt(each);
            }
        }
        return sum;
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */

