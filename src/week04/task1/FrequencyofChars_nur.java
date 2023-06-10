package week04.task1;

import java.util.Collections;
import java.util.List;

public class FrequencyofChars_nur {


    public static void main(String[] args) {
        System.out.println(freqChars("AAABBCDD"));

    }

    public static String freqChars(String sentence){
        sentence= "AAABBCDD";
        String result="";

        for(int i=0; i<sentence.length(); i++){
            char ch= sentence.charAt(i);
            int count=0;
            for (int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j)==ch){
                    count++;
                }

            }
            if(result.contains(""+ ch)){
                continue;
            }
            result+= ch+ ""+ count;



        }
        return result;

    }


}

/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */