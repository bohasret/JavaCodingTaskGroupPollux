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


        OddEven(15);
        OddEven(20);
        OddEven(34);

        System.out.println(oddEven(27));
        oddEven(102);



    }




    public static void OddEven(int num) {


        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

    public static String oddEven ( int number){

        return (number % 2 == 0) ? "even" : "odd";
    }


}


