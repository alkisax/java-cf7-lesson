package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("give a num to check");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!");
        } else {
            System.out.println("failure");
        }
    }
}
