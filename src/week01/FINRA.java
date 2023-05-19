package week01;

import java.util.Scanner;

public class FINRA {
  public static void num(int n){
      if(n%15==0){
          System.out.println("FINRA");
      }else if(n%5==0){
          System.out.println("RA");
      }else if(n%3==0){
          System.out.println("FIN");
      }else {
          System.out.println(n);
      }
  }


    /*
     Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter a number from 1 to 30");
        FINRA.num(25);


    }
}
