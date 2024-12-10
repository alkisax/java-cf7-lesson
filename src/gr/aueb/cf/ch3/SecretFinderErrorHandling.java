package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * linearise code
 * continue break
 */
public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("give a num to check");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("try again");
                continue;  // proth fora to blepoyme
            }
            System.out.println("Bingo!");
            break; // proth fora
        }
    }
}
