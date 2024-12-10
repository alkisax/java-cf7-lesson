package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * dikaioma psifoy se hlikia pano ton 18
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_LIMIT = 18;
        boolean isEligible = false;
        int age = 0;

        System.out.println("give your age");
        age = scanner.nextInt();

        if (age >= AGE_LIMIT) {
            isEligible = true;
        }

        System.out.println("You are eligible to vote: " + isEligible);
    }




}
