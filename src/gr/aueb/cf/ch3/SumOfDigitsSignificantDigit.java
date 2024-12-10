package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ypologizei to athrisma tvn psifion dyo akaireon
 */
public class SumOfDigitsSignificantDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int inputNum = 0;
        int rightDigit = 0;

        System.out.println("enter a possitive integer");
        inputNum = scanner.nextInt();

        int tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum = tempNum / 10;
//            tempNum /= 10;
        }

        tempNum = inputNum;
        int firstNum = 0;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum = tempNum / 10;
//            tempNum /= 10;
            if (tempNum < 10 && tempNum > 0) {
                firstNum = tempNum;
            }
        }

        System.out.println("the sum of digits of " + inputNum + "is " + sum);
        System.out.println("firstNum = " + firstNum);
    }
}
