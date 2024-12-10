package gr.aueb.cf.ch3;

/**
 * print 10 horizontal *
 */
public class StarsWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print("*");
        }

        System.out.println();

        int j = 10;
        while (j >= 1) {
            System.out.print("*");
            j--;
        }
    }
}
