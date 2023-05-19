package week01;


import java.util.Scanner;

public class OddOrEven {
    public static String identify(int k){
        boolean isOdd= k%2 !=0;
        return (isOdd)? "Odd": "Even";
    }




    /*


     Numbers-  Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"


     */


    public static void main(String[] args) {
        System.out.println( OddOrEven.identify(6));



    }


}
