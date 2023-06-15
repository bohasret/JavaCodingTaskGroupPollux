package javaCodingTasks.Afshin.Week04.Task2;

import java.util.*;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println("Are they anagrams of each other?: " + SameLetters.sameLetters("abc", "abb"));
    }
    public static Boolean sameLetters(String arnold, String clone) {
        List<Character> arrayArnold = new ArrayList<>();
        List<Character> arrayClone = new ArrayList<>();
        for (int i = 0; i < arnold.length(); i++) {
            arrayArnold.add(arnold.charAt(i));
            Collections.sort(arrayArnold);
        }
        for (int i = 0; i < clone.length(); i++) {
            arrayClone.add(clone.charAt(i));
            Collections.sort(arrayClone);
        }
        if(arrayArnold.equals(arrayClone)){
            return true;
        }else{
            return false;
        }
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string
ex: same("abc", "cab"); ==> true
    same("abc", "abb"); ==> false
 */
