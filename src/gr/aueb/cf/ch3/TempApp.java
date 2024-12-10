package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * λαμβανει μια θερομκρασσία παοτ ν χρήστρη και εμφανιζει μύνημα
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("please insert curent temperetare");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("temperature is below zero: " + isTempBelowZero);
    }
}
