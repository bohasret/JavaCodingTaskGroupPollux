package week04.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup_nur {

    public static void main(String[] args) {
        System.out.println(removeDup("KKAAAABU"));

    }
    public static String removeDup(String str){

        Set<String> check= new LinkedHashSet<>(); //to keep insertion order
        check.addAll(Arrays.asList(str.split("")));
        return check.toString().replaceAll(", ", "").replace("[", "").replace("]","");



    }

}

/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */