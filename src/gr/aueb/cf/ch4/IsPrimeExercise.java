package gr.aueb.cf.ch4;

import java.util.Scanner;

public class IsPrimeExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPrime = false;
        System.out.println("give a number");
        int input = scan.nextInt();
        isPrime = isPrime(input);
        System.out.println("is prime? " + isPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if ( num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt((num)); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
