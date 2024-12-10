package gr.aueb.cf.ch1;


/**
 * calculates the sum of two integers.
 * and the result is printed at the consol
 * (standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        //δήλωση και αρχικοποίηση μεταβλητών
        int num1  = 5;
        int num2 = 12;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //εκτύπωση του αποτελέσματος
        System.out.println("το αποτέλεσμα είναι: " + result);
        System.out.println("το άρθροισμα των " + num1 + " , " + num2 + " είναι ίσο με " + result);

        // formated souf
        System.out.printf("το άθροισμα των %d, %d είναι ίσο με %d \n", num1, num2, result);


    }
}
