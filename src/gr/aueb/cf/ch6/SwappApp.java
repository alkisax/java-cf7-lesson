package gr.aueb.cf.ch6;

public class SwappApp {
    public static void main(String[] args) {
        int[] arr = {1, 10};
        swapp(arr);
        printArray(arr);

    }
    public static void swapp (int[] arr) {
        if (arr.length != 2) {
            return;
        }
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int el: arr) {
            System.out.println(el + " ");
        }
    }
}
