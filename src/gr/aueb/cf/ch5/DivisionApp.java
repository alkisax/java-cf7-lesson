package gr.aueb.cf.ch5;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.5F; //pr;epei na to valo to F

        div= num1 /num2;
        mod = num1 % num2;
        System.out.printf("Div %.2f\n", div);
        System.out.printf("Mod %.2f\n", mod);

        // επειδή αναγκαστικά κάνει στρογκυλοποίηση δεν μπορών να χρησιμοποιήσω την ισότητα == θα πρεπει να δώσω έναν ορισμο ακρίβιας για την ισότητα.
        /*
        d1-d2 <= epsilon βαθμος ακρίβιας
        υπάρχουν έτοιμες μέθοδοι
         */

    }
}
