package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SquareExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number");
        int input = scan.nextInt();
        int result = square(input);
        System.out.println(result);
    }
    public static int square(int n) {
        int square = n*n*n;
        return square;
    }
}
