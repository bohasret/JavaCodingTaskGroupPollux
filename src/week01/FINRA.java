package week01;

public class FINRA {


    /*
     Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {

        //System.out.println(finra());
    }


    public static String finra(){

        String result = "";

        for (int i = 1; i <= 30; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";

            } else if (i % 5 == 0) {
                result += "RA ";

            } else if(i % 3 == 0){
                result += "FIN ";

            } else{
                result += i +" ";
            }

        }
       return result;



}





}



