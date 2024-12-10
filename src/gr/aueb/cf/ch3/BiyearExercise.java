package gr.aueb.cf.ch3;
import java.util.Scanner;

public class BiyearExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.println("give a year:");
        year = in.nextInt();


        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        } else if (year % 4 == 0 && year % 400 == 0) {
            leapYear = true;
        } else if (year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        System.out.println("the year " + year + " is leapYear: " + leapYear);
    }
}
