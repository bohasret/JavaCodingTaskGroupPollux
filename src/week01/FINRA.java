package week01;


public class FINRA {

    /*
     Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void main(String[] args) {
        int num = 16;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(num);
        }


        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }

        System.out.println();


        for (int i = 1; i < 31; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FINRA" : (i % 3 == 0) ? "FIN" : (i % 5 == 0) ? "RA" : "" + i;
            System.out.println(result);
        }
    }
}





