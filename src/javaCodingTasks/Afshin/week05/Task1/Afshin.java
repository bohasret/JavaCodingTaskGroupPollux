package javaCodingTasks.Afshin.week05.Task1;
public class Afshin {
    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";
        System.out.println(uniqueCharacters(word));
    }
    public static String uniqueCharacters(String word) {
        String uniqueCharacters = "";

        for (int i = 0; i < word.length(); i++) { //A//A//A
            int count = 0;
            for (int j =0; j < word.length(); j++) { //A->A->A->B->B->B->C->C->C->D->E->F
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                    }
                }
            if (count==1) {
                uniqueCharacters += "" + word.charAt(i);
            }
        }
        return uniqueCharacters;
    }
}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */