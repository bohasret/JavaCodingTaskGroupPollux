package javaCodingTasks.Afshin;

public class Finra {

    public static void main(String[] args) {
        int count = 0;
        while (count < 30) {
            count++;
            if (count % 3 != 0 && count % 5 != 0) {
                System.out.print(count);
            }
            if (count % 3 == 0) {
                System.out.print("FIN");
            }
            if (count % 5 == 0) {
                System.out.print("RA");
            }
            System.out.println("");

        }

    }
}
