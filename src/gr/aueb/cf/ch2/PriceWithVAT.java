package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 * υπολογιζει τιμη με φπα
 */
public class PriceWithVAT {
    public static void main(String[] args) {
        final int VAT = 28;
        double priceWithVat = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a price");
        double  price = scanner.nextDouble();

        priceWithVat = (double) price + (price * VAT) / 100;

        System.out.printf("The final price is: %.2f%n", priceWithVat);

    }
}
