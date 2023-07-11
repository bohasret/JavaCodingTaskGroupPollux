package javaCodingTasks.week05.Task2;

public class Afshin {
    public static void main(String[] args) {
    String sentence = "Mirror";
        System.out.println(reverseIt(sentence));
    }
    public static String reverseIt(String sentence){
        String reversed = "";
        for (int i = sentence.length()-1; i >= 0; i--) {
            reversed += ""+sentence.charAt(i);
        }
        return reversed; 
    }
}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
