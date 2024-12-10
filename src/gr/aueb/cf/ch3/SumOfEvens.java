package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        int limit = 0;
        int i = 1;
        Boolean isEven = false;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("give upper limit");
        limit = scanner.nextInt();


        while (i <= limit) {
            isEven = (i % 2 == 0);
            if (isEven) {
                sum += i;
            }
            i++;
        }
        System.out.println("the sum is : " + sum);
    }
}
