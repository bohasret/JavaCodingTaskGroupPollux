package week01;

public class OddOrEven {

    /*


     Numbers-  Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"


     */


    public static void main(String[] args) {

        identify(3);




    }

    public static void identify(int number){
        if(number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }




}
