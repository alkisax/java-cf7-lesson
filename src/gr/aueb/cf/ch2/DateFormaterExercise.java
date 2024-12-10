package gr.aueb.cf.ch2;
import java.util.Scanner;

public class DateFormaterExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date = 0;
        int month = 0;
        int year = 0;

        System.out.println("give date:");
        date = Integer.valueOf(scan.nextLine());
        System.out.println("give month: ");
        month = Integer.valueOf(scan.nextLine());
        System.out.println("give year: ");
        year = Integer.valueOf(scan.nextLine());

        System.out.printf("%02d/%02d/%04d", date, month, year);
    }
}
