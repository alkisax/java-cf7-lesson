package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
