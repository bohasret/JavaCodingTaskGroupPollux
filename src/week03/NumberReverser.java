package week03;

public class NumberReverser {
    //Write a return method that can reverse digits of a negative number and return it as int
    public static int reverseNegativeNumber( int number){
        boolean isNegative = false;

        if(number < 0){
            isNegative = true;
            number = -number;
        }
        int reverseNumber = 0;

        while(number > 0){
            int digit = number %10;
            reverseNumber = reverseNumber * 10 + digit;
            number/= 10;
        }
        if(isNegative){
            reverseNumber = -reverseNumber;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        int number = -53;
        int reversedNumber = NumberReverser.reverseNegativeNumber(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

}
