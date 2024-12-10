package gr.aueb.cf.ch2;


/**
 * demo for typecast
 */
public class TypecatApp {
    public static void main(String[] args) {
        int num1= 10;
        long num2 = 20L;

        // num1 = num2; //αυτο δεν γίνετε
        num1 = (int) num2;
    }
}
