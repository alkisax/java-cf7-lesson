package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * big integer class demo
 */
public class BigIntApp {
    //psvm
    public static void main(String[] args) {
        //declarations and initializations
        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNum2 = new BigInteger("234567890345678");
        BigInteger result;

        //comands
        //δεν επιτρέπετε σε κλάση να βάλω +
        result = bigNum1.add(bigNum2);

        //printing results
        System.out.printf("%,d", result);
    }
}
