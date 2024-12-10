package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int num = 0;

        while ((num = in.nextInt()) >= 0) {
       } // den κάνει απολύτως τίποτα. απλώς καταναλώνει όλους τους θετικούς αρηθμούς

        int i = 1;
        while (i <= 0) {
            System.out.println("never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("gets in only one time");
            i++;
        }

        while (true) {
            System.out.println("eternal loop");
        }

    }
}
