package gr.aueb.cf.ch5;

/**
 * adds two int with method
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;
        sum = AddApp.add(a,b);
        sub = AddApp.sub(a,b);

    }

    /**
     * adds two ints
     * @param a first int
     * @param b second int
     * @return sum of two
     */
    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
//        return result;
        return a + b;
    }

    public static int sub(int a, int b) {
        return a -b;
    }
}
