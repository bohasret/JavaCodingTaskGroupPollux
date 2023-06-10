package week04.task2;

import java.util.Arrays;

public class SameLetters_nur {

    public static void main(String[] args) {

        System.out.println(same("abc","akc"));
        System.out.println(same("abc","cab"));

    }
    public static boolean same(String str1, String str2){


        String[] a1= str1.split("");
        String[] a2= str2.split("");
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);



    }


}


/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */