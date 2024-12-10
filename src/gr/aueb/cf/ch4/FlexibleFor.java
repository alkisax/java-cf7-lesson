package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FlexibleFor {
    public static void main(String[] args) {
        int startVal =0;
        int endVal = 0;
        int stepVal =0;
        int iterations = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("give start end step");

        startVal = scanner.nextInt();
        endVal = scanner.nextInt();
        stepVal = scanner.nextInt();

        for (int i= startVal; i <= endVal; i += stepVal) {
            iterations++;
            System.out.println(i + " ");
        }
            System.out.println();
        System.out.println(iterations);
    }
}
