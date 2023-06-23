package week05.task2;

public class Zack {
    /*
    ============= String -- Reverse ===========================
      Write a function that can reverse a String
           Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println("strReverse_1(\"ABCD\") = " + strReverse_1("ABCD"));
        System.out.println("strReverse_2(\"ABCD\") = " + strReverse_2("ABCD"));
    }

    // ============= SOLUTION 1 =============================
    /**
     * reverses the given String
     * @param str String
     * @return String
     */
    public static String strReverse_1(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return  reverse;
    }

    // ============= SOLUTION 2 =============================
    /**
     * reverses the given String
     * @param str String
     * @return String
     */
    public  static String  strReverse_2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    // ============= SOLUTION 3 =============================
    /**
     * returns unique characters from the given String
     * @param str String
     * @return String
     */
    public static String unique_3(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) { //
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }

        return unique;
    }

}
