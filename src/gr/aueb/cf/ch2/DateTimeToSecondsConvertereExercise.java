package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConvertereExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = 0;
        int hours = 0;
        int hoursOriginal;
        int mins = 0;
        int minsOriginal = 0;
        int secs = 0;
        System.out.println("give days");
        days = in.nextInt();
        System.out.println("give hours");
        hours = in.nextInt();
        System.out.println("give mins");
        mins = in.nextInt();

        hoursOriginal = hours;
        minsOriginal = mins;

        hours += days * 24;
        mins += hours * 60;
        secs = mins * 60;
        System.out.printf(Locale.US, "the %d days, %d hours and %d mins the user gave is %,d seconds%n" +
                " ", days, hoursOriginal, minsOriginal, secs);

    }
}
