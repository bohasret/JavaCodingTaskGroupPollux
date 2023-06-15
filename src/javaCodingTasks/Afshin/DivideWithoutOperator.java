package javaCodingTasks.Afshin;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to divide: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the number you want to divide with: ");
        int number2 = scanner.nextInt();
        int remainder = number1+1;
        if (number1 < number2) {
            if(number1 == 0){
                System.out.println("Yeah really needed me to tell you zero divided by errthang is equal to zero? Ya mook!");
            }if(number1==0 && number2 ==0 ){
                System.out.println("Buddy, you trying to give me a headache, get out of here!");
                System.exit(1);
            }
            System.out.println("OOOhhhh! Buddy! I was programmed by some SDET wannabe clown, " +
                        "you think I'm smart enough to be solving them decimal dealies? " +
                        "I go get a calculator over there, I be back. Ciao!");
            }
            System.exit(1);
        int count = 0;
        while (remainder >= number2) {
            count++;
            remainder = number1 - count * number2;

        }
        System.out.println(number1 + " divided by " + number2 + " equals " + count + " with " + " a remainder of " + remainder);
    }
}
