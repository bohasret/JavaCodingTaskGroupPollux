package javaCodingTasks.Afshin.week01.task1;

public class OddOrEven {

    /*


     Numbers-  Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"


     */

    public static String oddEven(int num) {
        String odd = "Odd";
        String even = "Even";
        if (num %2 == 0) {
            return even;
        } else {
            return odd;
        }


    }

    public static void main(String[] args) {
        System.out.println(oddEven(7));
    }
}

