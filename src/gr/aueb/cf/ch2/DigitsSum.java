package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int first = 0;
        int second = 0;

        System.out.println("give a  two digit number");
        number  = in.nextInt();

        first = number / 10;
        second = number % 10;
        sum = first + second;


        System.out.printf("the sum of the digits is %d", sum);
    }
}
