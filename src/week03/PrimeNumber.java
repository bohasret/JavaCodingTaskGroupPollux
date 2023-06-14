package week03;

import com.sun.security.jgss.GSSUtil;

public class PrimeNumber {
    //write a method that can check if the number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 13;
        boolean isPrimeNumber = PrimeNumber.isPrime(number);

        if(isPrimeNumber){
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is not prime number");
        }

    }
}


