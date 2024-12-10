package gr.aueb.cf.ch5;

public class EvenOddApp {
    public static void main(String[] args) {
        int num = 10;
        boolean  isEven = isEven(num);
        boolean  isOdd = isOdd(num);
        System.out.println("is even " + isEven);
        System.out.println("is Odd " + isOdd);

    }

    public static boolean isEven (int num) {
        boolean isEven = (num % 2 == 0);
        return isEven;


    }

    public static boolean isOdd (int num) {
        boolean isOdd = !isEven(num);
        return isOdd;
    }
}
