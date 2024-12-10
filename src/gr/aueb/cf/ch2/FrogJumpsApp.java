package gr.aueb.cf.ch2;

/**
 * How many jumps from x to y
 * x = 10
 * y = 85
 * d = 30
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;
        int factor = 0;

        jumps = (int) Math.ceil((double) (target - start) / hop);
        factor = (target - start) % hop;

        System.out.println("Jumps: " + jumps);
    }
}
