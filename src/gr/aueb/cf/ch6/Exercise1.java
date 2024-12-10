package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1};

        System.out.println("prints max position(expect 8)");
        int ask1 = getMaxPosition(arr, 2,8);
        System.out.println(ask1);

        System.out.println("prints second to min position (expet 0)");
        int ask2= secondToMin(arr); //expected 1
        System.out.println(ask2);

        System.out.println("δωσε στοιχείο να αανζητηθεί η θέση του");
        int input = scanner.nextInt();
        int ask3 = findPosition(arr, input);
        System.out.println(ask3);

        System.out.println("print odds");
        printOdds(arr);

        System.out.println("gives double");
        for (int el: doubleMaper(arr)){
            System.out.println(el);
        }

        System.out.println("has positve expect true");
        System.out.println(hasPositive(arr));

        System.out.println("all positive expect false");
        System.out.println(allPositive(arr));


    }
    public static int getMaxPosition (int[] arr, int low, int high){
        if (low < 0 || high >= arr.length || high < low) { return -1; }
        int max = Integer.MIN_VALUE;
        int maxPosition = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static int getMinPosition(int[] arr){
        int min = Integer.MAX_VALUE;
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int secondToMin (int[] arr){
        int minPosition = getMinPosition(arr);
        int min = arr[minPosition];
        int secondToMinPostion = -1;
        int secondToMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] < secondToMin){
                secondToMin = arr[i];
                secondToMinPostion = i;
            }
        }
        return secondToMinPostion;
    }

    public static int findPosition(int[] arr, int input) {
        int position = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == input){
                position = i;
            }
        }
        return position;
    }

    public static void printOdds (int[] arr) {

        for (int el: arr) {
            if (el % 2 == 1) {
                System.out.println(el);
            }
        }
    }

    public static int[] doubleMaper(int[] arr) {
        int[] doubleArr = new int[arr.length];
        for (int i = 0; i < doubleArr.length; i++){
            doubleArr[i] = arr[i]*2;
        }
        return doubleArr;
    }

    public static boolean hasPositive (int[] arr) {
        boolean hasPositive = false;
        for (int el: arr){
            if (el > 0) {
                hasPositive = true;
            }
        }
        return hasPositive;
    }

    public static boolean allPositive(int[] arr) {
        boolean allPositive = true;
        for (int el: arr) {
            if (el < 0) {
                allPositive = false;
            }
        }
        return allPositive;
    }

}
