package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ypologizoyme dynameis (eis thn trith klp)
 */
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        System.out.println("insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();


        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.println("result: " + result);

    }
}
