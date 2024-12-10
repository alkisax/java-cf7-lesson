package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avg = 0;
        int totalMarks = 0;
        int coursesCount = 0;

        System.out.println("give totalmarks");
        totalMarks = scanner.nextInt();
        if (totalMarks <= 0) {
            System.out.println("total marks must not be 0");
            System.exit(1);
        }
        System.out.println("insert courses count");
        coursesCount = scanner.nextInt();
        if  (coursesCount <= 0) {
            System.out.println("can not be 0");
            System.exit(1);
        }

        avg = totalMarks /coursesCount;
        if (avg > 10) {
            System.out.println("error avg not valid");
            System.exit(1);
        }
        if (avg >= 9) {
            System.out.println("exelent");
        } else if (avg >= 7) {
            System.out.println("very good");
        } else if (avg >= 5) {
            System.out.println("good");
        } else {
            System.out.println("F");
        }
    }
}
