package week04.task3;

import java.util.Arrays;

public class irem {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AABBCCDD"));
        System.out.println(removeDuplicates("AAMMKLSUUUOOOPSSSD"));
    }


    /**
     * Write a return method that can remove the duplicated values from the String
     * param
     * return
     */

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            str.split("");

            String str1 = "" + str.charAt(i);
            if(result.contains(str1)){
                continue;
            }else{
                result += str1;
            }

        }

        return result;
    }


}
/*
3️⃣  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */