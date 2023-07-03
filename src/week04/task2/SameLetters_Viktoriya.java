package week04.task2;

import java.util.Arrays;

public class SameLetters_Viktoriya {
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static boolean sameLetters( String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each: ch1){
            a1 += each;
        }

        for(char each : ch2){
            a2+=each;
        }
        return a1.equals(a2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));
    }
}
