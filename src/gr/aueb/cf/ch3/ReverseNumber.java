package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * antistrefei ennan akaireo px 123>321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String reverseNum;
        int reversed = 0;
        int rightDigit = 0;


        System.out.println("enter a posotive integer");
        num = scanner.nextInt();

        int temp = num;
        while (temp > 0) {
            rightDigit = temp % 10;

            reversed = reversed * 10 + rightDigit;

            temp /= 10;
        }




        System.out.println("the revercedNum = " + reversed);
    }
}
