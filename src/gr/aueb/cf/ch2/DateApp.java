package gr.aueb.cf.ch2;

public class DateApp {
    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;

        System.out.println("η ημερομηνία είναι " + day + "/" + month + "/" + year);

        System.out.printf("η ημερομηνία είναι %,02d / %02d / %2d", day, month, year);


    }
}
