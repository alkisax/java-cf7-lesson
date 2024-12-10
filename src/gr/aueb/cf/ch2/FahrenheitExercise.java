package gr.aueb.cf.ch2;
import java.util.Scanner;

public class FahrenheitExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempF = 0;
        int tempC = 0;

        System.out.println("δώστε Τ σε F: ");
        tempF = Integer.valueOf(scan.nextLine());
        tempC = (5 * (tempF - 32)) / 9;

        System.out.println(" Η Τ σε C είναι: " + tempC);

    }
}
