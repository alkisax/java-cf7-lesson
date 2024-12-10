package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * turn lighs on if it is running(>100) OR is dark
 */
public class LightsOn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean isRaining = false;
        Boolean isDark = false;
        int km = 0;
        int MAX_CAR_SPEED = 100;
        Boolean isCarRunning = false;
        boolean isLightOn = false;

        System.out.println("is it raining?");
        isRaining = in.nextBoolean();
        System.out.println("is it dark");
        isDark = in.nextBoolean();
        System.out.println("Give speed");
//        isCarRunning = in.nextBoolean();
        km = in.nextInt();

        isCarRunning = km > MAX_CAR_SPEED;

        isLightOn = isRaining && (isDark || isCarRunning);
        System.out.println("the lights are on: " + isLightOn);
    }
}
