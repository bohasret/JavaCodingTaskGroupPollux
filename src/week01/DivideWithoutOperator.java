package week01;

public class DivideWithoutOperator {

    /*

     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator

     */


    public static void main(String[] args) {

        //System.out.println(divide(4,3));

    }


    public static int divide(double num1, double num2){

        if(num2 == 0){
            throw new ArithmeticException("Divisor can not be zero.");
        }

        int result = 0;

        while (num1>=num2){
            num1 -= num2;
            result++;

        }

        return result;

    }










}

