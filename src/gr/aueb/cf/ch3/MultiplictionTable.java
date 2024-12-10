package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * dinei os output enan pinaka propedia apo akaireo toy xristi
 */
public class MultiplictionTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;
        int i = 1;

        System.out.println("give num:");
        num = scanner.nextInt();

        while (i <= 10) {
            result = i * num;
            System.out.printf("%2d * %2d = %2d%n", num, i, result);
            i++;
        }
    }
}
