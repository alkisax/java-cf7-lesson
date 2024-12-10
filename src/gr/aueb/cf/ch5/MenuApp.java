package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = scanner.nextInt();
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("chose one");
        System.out.println("1 input");
        System.out.println("2 read");
        System.out.println("3 update");
        System.out.println("4 delete");
        System.out.println("5 exit");

    }
}
