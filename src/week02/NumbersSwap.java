package week02;

public class NumbersSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a + " " + b);
        a = a + b; // a =5 +10
        b = a - b; // b = 15 -10
        a = a - b; // a = 15-5
        System.out.println(a + " " + b);


    }
}
/*
Swap two variable values without using a third variable
 */