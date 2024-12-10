package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FindMaxExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give num a");
        int a = scan.nextInt();
        System.out.println("give num a");
        int b = scan.nextInt();
        System.out.println("give num a");
        int c = scan.nextInt();
        int result = bigger(a,b,c);
        System.out.printf("the biggest among %d, %d, %d is the %d", a, b, c, result);
    }

    public static int bigger(int a, int b, int c) {
        int bigger = Integer.MIN_VALUE;
        if (a > bigger) {
            bigger = a;
        }
        if (b > bigger) {
            bigger = b;
        }
        if (c > bigger) {
            bigger = c;
        }
        return bigger;
//        return Math.max(Math.max(a, b), c);
    }

}
