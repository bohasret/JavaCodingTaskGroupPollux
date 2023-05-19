package week01;

public class DivideWithoutOperator {
    public static void division(int k, int n){
        if(k==0){
            throw new ArithmeticException("divisor cannot be zero");
        }
        int result=0;
        while(k>=n){ //10,3
            k= k-n; //k=7, n=3
            result++;
        }
        System.out.println(result);

    }
    

    /*

     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator

     */


    public static void main(String[] args) {
       DivideWithoutOperator.division(10,3);


    }

}

