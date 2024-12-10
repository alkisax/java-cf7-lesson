package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give n");
        int n = scan.nextInt();
        System.out.println("give pow");
        int pow = scan.nextInt();
        double result = pow(n,pow);
    }

    public static long pow(int n, int pow) {
        long result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= n;
        }
        return result;
    }
}
