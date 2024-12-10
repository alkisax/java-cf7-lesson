//package gr.aueb.cf.ch4;
//
//import gr.aueb.cf.ch3.ChoiceExercise;
//
//import java.util.Scanner;
//
//public class SwitchCaseApp {
//    Scanner scanner = new Scanner(System.in);
//    int choice;
//
//    do {
//        System.out.println("choose one");
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//
//        choice = scanner.nextInt();
//        if (choice <1 || choice >4) {
//            System.out.println("choice must be 1-4");
//        }
//
//        if (choice == 1) {
//            System.out.println("1");
//        } else if (choice == 2) {
//            System.out.println("2");
//        } else if (choice == 3) {
//            System.out.println("3");
//        } else {
//            System.out.println("quit");
//        }
//    } while (choice != 4);
//
//
//    switch (choice) {
//        case 1:
//            System.out.println("1");
//            break;
//        case 2:
//            System.out.println(" ");
//            break;
//        case 3:
//            System.out.println(" ");
//            break;
//        default:
//            System.out.println(" ");
//            break;
//    }
//
//
//}
