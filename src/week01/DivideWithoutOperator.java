package week01;

public class DivideWithoutOperator {

    /*

     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator

     */


    public static void main(String[] args) {


        System.out.println(DivideTwoNumbers(10,2));
        System.out.println(DivideTwoNumbers(0,3));
        // DivideTwoNumbers(5,0);
        System.out.println(DivideTwoNumbers(20,3));
        System.out.println(DivideTwoNumbers(18,7));
    }

    public static int DivideTwoNumbers(int n1, int n2){

        if( n2==0){
            System.err.println("Divisor cannot be zero");
        }

        if(n1 ==0){
            System.out.println(0);
        }

        int quotient = 0;

        while(n1 >= n2){
            n1 -= n2;

            quotient++;
        }

        return quotient;
    }

}

