package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IoStrApp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        System.out.println("instert two string");
        s1 = in.next();
        s2 = in.nextLine();
        System.out.printf("s1 %s\n", s1);
        System.out.printf("s2 %s\n", s2);
    }
}