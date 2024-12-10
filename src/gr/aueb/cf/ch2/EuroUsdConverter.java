package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        int euro = 0;
        int dol = 0;
        int cent = 0;
        int totalcents = 0;
        int rate = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("give amount in Euro: ");
        euro = in.nextInt();



        totalcents = euro * rate;

        dol = totalcents / 100;
        cent = totalcents % 100;
        System.out.printf("\u20AC its %d dollars\u0024 and %d cents", dol, cent);

    }
}
