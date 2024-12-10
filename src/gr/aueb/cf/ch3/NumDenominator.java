package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("give numerator.  quit with 0");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("numerator =0 quiting");
                break;
            }

            System.out.println("give denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("denominator must !=0 ");
                continue;
            }

            result = numerator / denominator;
            System.out.println(result);

//            if (denominator != 0) {
//                if (numerator != 0) {
//                    result = numerator / denominator;
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("");
//                continue;
//            }
        }
    }
}
