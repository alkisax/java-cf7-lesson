package gr.aueb.cf.ch2;

/**
 * steps up distance down by on
 */
public class CounterApp {
    public static void main(String[] args) {
        int steps = 0;
        int distance = 3;

        System.out.printf("Steps: %d, distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, distance: %d\n", steps++, distance--);
        System.out.printf("Steps: %d, distance: %d\n", steps, distance);
    }
}
