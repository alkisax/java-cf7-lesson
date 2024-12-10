package gr.aueb.cf.ch6;

public class ArrayMinMax9 {
    public static void main(String[] args) {

    }
    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1; // Return -1 if the array is null or empty
        }

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) { // Start from index 1 to avoid comparing the first element with itself
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getMinPosition(int[] arr, int low, int high){
        if (arr == null || arr.length < 1) {return -1;}
        if (high <= arr.length || low <0) { return -1;}
        if (low < high) {return -1;}
        int minPosition = Integer.MIN_VALUE;
        int minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
