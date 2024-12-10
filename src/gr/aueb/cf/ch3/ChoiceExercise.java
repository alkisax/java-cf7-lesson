package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ChoiceExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice1 = "1. Εισαγωγή";
        String choice2 = "2. Διαγραφή";
        String choice3 = "3. Ενημέρωση";
        String choice4 = "4. Αναζήτηση";
        String choice5 = "5. Έξοδος";

        while (true) {
            System.out.println(choice1);
            System.out.println(choice2);
            System.out.println(choice3);
            System.out.println(choice4);
            System.out.println(choice5);
            System.out.println("make a choice: ");
            int input = in.nextInt();

            if (input == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
            } else if (input == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (input == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (input == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (input == 5) {
                break;
            } else {
                System.out.println("give a number within range");
            }
        }
    }
}
