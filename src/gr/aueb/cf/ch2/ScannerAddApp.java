package gr.aueb.cf.ch2;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * scanner demo. Reads two integers from thw std input (keyboard) and calculates the result
 */

public class ScannerAddApp {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        Scanner in = new Scanner(System.in); // system out η κονσολα system in το πληκτορολογιο

        System.out.println("please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.printf("the sum of %d and %d equals %d", num1, num2, sum);
    }
}
