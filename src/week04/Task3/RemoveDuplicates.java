package week04.Task3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates.removeDup("AAABBBCCC");
    }

    public static void removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) { //0-->1-->2-->3-->4-->5-->6-->7-->8
            result += "";                        //A-->A-->A-->B-->B-->B-->C-->C-->C
            if ((!result.contains("" + str.charAt(i)))) {
                result += str.charAt(i); //NO(add)->Yes(nothing)->Yes(nothing)->NO(add)->Yes(nothing)..etc
            }
        }
        System.out.println(result);
    }
}
/*
write a return method that can remove the duplicated values from the String
Ex: removeDup("AAABBBCCC" ==> ABC
 */
