package gr.aueb.cf.ch3;

/**
 * calculates the sum and multiple of first 10 int
 */
public class SumAll {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mult = 1;


        while (i <= 10) {
            sum += i;
//            mult *= i;
            i++;
            System.out.println(sum);
        }
        System.out.println();
        i = 1;
        while (i <= 10) {
            mult *= i;
            i++;
            System.out.println(mult);
        }
    }
}
