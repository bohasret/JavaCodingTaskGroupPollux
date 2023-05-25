package week01;

public class DivideWithoutOperator {

    /*

     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator

     */


    public static void main(String[] args) {

        DivideWithoutOperator(80, 4);

    }

    public static void DivideWithoutOperator(double num1, double num2) {
            int count = 0;
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }

            System.out.println("num1 / num2 = " + count);

    }
}

